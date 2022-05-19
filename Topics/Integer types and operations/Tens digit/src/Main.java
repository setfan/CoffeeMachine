import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int hundreds = 100;
        final int tens = 10;
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int hundredsReminder = number % hundreds;
        int tensOfNumber = hundredsReminder / tens;

        System.out.println(tensOfNumber);

    }
}