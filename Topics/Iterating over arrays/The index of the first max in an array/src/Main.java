import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int maxIndex = 0;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (numbers[i] > maxElement) {
                maxIndex = i;
                maxElement = numbers[i];
            }
        }

        System.out.println(maxIndex);
    }
}