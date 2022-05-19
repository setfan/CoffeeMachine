import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int maxProduct = 0;
        int product;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            product = numbers[i] * numbers[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        System.out.println(maxProduct);
    }
}