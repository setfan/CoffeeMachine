
class Cat {

    final int maxCats = 5;

    String name;
    int age;
    private static int countCats;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        countCats++;

        if (countCats > maxCats) {
            printMessage();
        }
    }

    public static int getNumberOfCats() {
        return countCats;
    }

    private static void printMessage() {
        System.out.println("You have too many cats");
    }
}