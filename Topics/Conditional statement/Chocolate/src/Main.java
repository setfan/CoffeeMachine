import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int zero = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean isDividedByN = k % n == zero;
        boolean isDividedByM = k % m == zero;

        boolean isDivided = isDividedByM || isDividedByN;

        if (k == n || k == m) {
            System.out.println("YES");
        } else if (n * m >= k && isDivided) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }

    }
}