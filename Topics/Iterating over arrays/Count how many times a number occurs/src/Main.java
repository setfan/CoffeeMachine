import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();

        }
        int n = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}