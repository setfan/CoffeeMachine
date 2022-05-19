import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int one = 1;
        Scanner scanner = new Scanner(System.in);

        int durationInDays = scanner.nextInt();
        int totalFoodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOneNightHotel = scanner.nextInt(); //the number of nights equal duration minus one

        int totalFood = durationInDays * totalFoodCostPerDay;
        int totalHotelCost = costOneNightHotel * (durationInDays - one);
        int totalTravelCost = oneWayFlightCost + oneWayFlightCost;

        int totalVacationExpense = totalFood + totalHotelCost + totalTravelCost;


        System.out.println(totalVacationExpense);

    }
}