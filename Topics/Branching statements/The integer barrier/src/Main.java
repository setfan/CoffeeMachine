import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int limit = 1000;
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;

        do {
            num = scanner.nextInt();

            sum += num;

            if (sum >= limit) {
                System.out.println(sum - limit);
                return;
            }

        } while (num != 0);

        System.out.println(sum);

    }
}