package machine;

import java.util.Scanner;

class CommandInterpreter {
    static String command;
    final static Scanner scanner = new Scanner(System.in);

    public static String readCommand() {
        command = scanner.next();
        return command;
    }
}

public class CoffeeMachine {

    final int waterForEspresso = 250; // ml
    final int coffeeBeansForEspresso = 16; // g
    final int costForEspresso = 4; // $

    final int waterForLatte = 350; // ml
    final int milkForLatte = 75; // ml
    final int coffeeBeansForLatte = 20; // g
    final int costForLatte = 7; // $

    final int waterForCappuccino = 200; // ml
    final int milkForCappuccino = 100; // ml
    final int coffeeBeansForCappuccino = 12; // g
    final int costForCappuccino = 6; // $

    int water = 400; // ml
    int milk = 540; // ml
    int coffeeBeans = 120; // g
    int cups = 9; // pieces
    int money = 550; // $

    Status currentStatus = Status.EXPECT_ACTION;

    enum Status {
        EXPECT_ACTION, EXPECT_WHAT_TO_BUY, MAKING_COFFEE, FILL_WATER, FILL_MILK, FILL_COFFEE_BEANS, FILL_CUPS
    }


    void run() {
        printMessage("Write action (buy, fill, take, remaining, exit):");

        String input = CommandInterpreter.readCommand();

        switch (input) {
            case "buy":
                printMessage("What do you want to buy? 1 - espresso, 2 - latte, " +
                        "3 - cappuccino, back - to main menu:");
                this.currentStatus = Status.EXPECT_WHAT_TO_BUY;
                input = CommandInterpreter.readCommand();
                switch (input) {
                    case "1":
                        currentStatus = Status.MAKING_COFFEE;
                        if (areConsumablesEnough(waterForEspresso, coffeeBeansForEspresso, 0)) {
                            makeCoffee(waterForEspresso, coffeeBeansForEspresso, 0, costForEspresso);
                        } else {
                            checkMissingConsumables(waterForEspresso, coffeeBeansForEspresso, 0);
                        }
                        currentStatus = Status.EXPECT_ACTION;
                        break;
                    case "2":
                        currentStatus = Status.MAKING_COFFEE;
                        if (areConsumablesEnough(waterForLatte, coffeeBeansForLatte, milkForLatte)) {
                            makeCoffee(waterForLatte, coffeeBeansForLatte, milkForLatte, costForLatte);
                        } else {
                            checkMissingConsumables(waterForLatte, coffeeBeansForLatte, milkForLatte);
                        }
                        currentStatus = Status.EXPECT_ACTION;
                        break;
                    case "3":
                        currentStatus = Status.MAKING_COFFEE;
                        if (areConsumablesEnough(waterForCappuccino, coffeeBeansForCappuccino, milkForCappuccino)) {
                            makeCoffee(waterForCappuccino, coffeeBeansForCappuccino, milkForCappuccino, costForCappuccino);
                        } else {
                            checkMissingConsumables(waterForCappuccino, coffeeBeansForCappuccino, milkForCappuccino);
                        }
                        currentStatus = Status.EXPECT_ACTION;
                        break;
                    case "back":
                        this.currentStatus = Status.EXPECT_ACTION;
                        break;
                    default:
                        break;
                }
                break;

            case "fill":
                fillMachine();
                currentStatus = Status.EXPECT_ACTION;
                break;
            case "take":
                takeMoney();
                currentStatus = Status.EXPECT_ACTION;
                break;
            case "remaining":
                printRemainingConsumables();
                currentStatus = Status.EXPECT_ACTION;
                break;
            case "exit":
                return;
            default:
                printMessage("Error!");
                break;
        }

        statusManager(this.currentStatus);
    }

    private void statusManager(Status currentStatus) {

        if (currentStatus.equals(Status.EXPECT_ACTION)) {
            this.run();
        }
    }

    private void printRemainingConsumables() {
        printMessage("The coffee machine has: ");
        printMessage(water + " ml of water");
        printMessage(milk + " ml of milk");
        printMessage(coffeeBeans + " g of coffee beans");
        printMessage(cups + " disposable cups");
        printMessage("$" + money + " of money");
    }

    private boolean areConsumablesEnough(int waterOrder, int coffeeBeansOrder, int milkOrder) {
        boolean enoughWater = water - waterOrder >= 0;
        boolean enoughCoffeeBeans = coffeeBeans - coffeeBeansOrder >= 0;
        boolean enoughMilk = milk - milkOrder >= 0;
        boolean enoughCups = cups - 1 >= 0;

        return enoughWater && enoughCoffeeBeans && enoughMilk && enoughCups;
    }

    private void takeMoney() {
        printMessage("I gave you $" + this.money);
        this.money = 0;
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    private void fillMachine() {
        currentStatus = Status.FILL_WATER;
        printMessage("Write how many ml of water you want to add:");
        int filledWater = Integer.parseInt(CommandInterpreter.readCommand());
        this.water += filledWater;

        currentStatus = Status.FILL_MILK;
        printMessage("Write how many ml of milk you want to add:");
        int filledMilk = Integer.parseInt(CommandInterpreter.readCommand());
        this.milk += filledMilk;

        currentStatus = Status.FILL_COFFEE_BEANS;
        printMessage("Write how many grams of coffee beans you want to add:");
        int filledCoffeeBeans = Integer.parseInt(CommandInterpreter.readCommand());
        this.coffeeBeans += filledCoffeeBeans;

        currentStatus = Status.FILL_CUPS;
        printMessage("Write how many disposable cups of coffee you want to add:");
        int filledCups = Integer.parseInt(CommandInterpreter.readCommand());
        this.cups += filledCups;

    }

    private void checkMissingConsumables(int waterOrder, int coffeeBeansOrder, int milkOrder) {
        String low;
        if (water - waterOrder < 0) {
            low = "water";
        } else if (milk - milkOrder < 0) {
            low = "milk";
        } else if (coffeeBeans - coffeeBeansOrder < 0) {
            low = "coffee beans";
        } else {
            low = "disposable cups";
        }

        printMessage("Sorry, not enough " + low + "!");
    }

    private void makeCoffee(int waterOrder, int coffeeBeansOrder, int milkOrder, int costCoffee) {
        printMessage("I have enough resources, making you a coffee!");

        water -= waterOrder;
        coffeeBeans -= coffeeBeansOrder;
        milk -= milkOrder;
        money += costCoffee;
        cups--;
    }

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.run();

    }
}


