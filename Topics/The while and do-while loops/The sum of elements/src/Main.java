import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        final int zero = 0;

        int num = zero;
        int sum = zero;

        do {
            num = scanner.nextInt();
            sum += num;
        } while (num != zero);

        System.out.println(sum);
    }
}