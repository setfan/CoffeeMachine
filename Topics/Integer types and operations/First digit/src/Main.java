import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int tens = 10;

        int number = scanner.nextInt();

        int tensOfNumber = number / tens;

        System.out.println(tensOfNumber);
    }
}