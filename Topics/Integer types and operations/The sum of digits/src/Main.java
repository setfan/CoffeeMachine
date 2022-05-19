import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int hundred = 100;
        final int ten = 10;

        int num = scanner.nextInt();

        int hundreds = num / hundred;
        int tens = (num % hundred) / ten;
        int digit = num % ten;

        int sumOfDigits = hundreds + tens + digit;

        System.out.println(sumOfDigits);
    }
}