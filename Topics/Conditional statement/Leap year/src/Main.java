import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int zero = 0;
        final int four = 4;
        final int hundred = 100;
        final int fourHundred = 400;
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % four == zero && year % hundred != zero || year % fourHundred == zero) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}