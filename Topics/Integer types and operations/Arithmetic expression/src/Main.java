import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int one = 1;
        final int two = 2;
        final int three = 3;

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int result = ((n + one) * n + two) * n + three;

        System.out.println(result);
    }
}