import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int one = 1;

        long m = scanner.nextLong();

        long n = one;
        int factor = one;

        while (n <= m) {
            n *= ++factor;
        }

        System.out.println(factor);
    }
}