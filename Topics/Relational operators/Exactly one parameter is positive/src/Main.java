import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int zero = 0;
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean isFirstNumberPositive = num1 > zero && num2 <= zero && num3 <= zero;
        boolean isSecondNumberPositive = num1 <= zero && num2 > zero && num3 <= zero;
        boolean isThirdNumberPositive = num1 <= zero && num2 <= zero && num3 > zero;


        System.out.println(isFirstNumberPositive || isSecondNumberPositive || isThirdNumberPositive);
    }
}