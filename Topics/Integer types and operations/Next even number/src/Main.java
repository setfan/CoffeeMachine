import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int zero = 0;
        final int one = 1;
        final int two = 2;
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result;

        if (number % two != zero) {
            result = number + one;
        } else {
            result = number + two;
        }

        System.out.println(result);
    }
}