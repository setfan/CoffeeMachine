import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rotations = scanner.nextInt();

        rotateRight(numbers, rotations);

        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));

    }

    private static void rotateRight(int[] numbers, int rotations) {
        for (int i = 0; i < rotations % numbers.length; i++) { // loop optimisation rotate 23 -> same as 3
            int temp = numbers[numbers.length - 1];
            for (int j = numbers.length - 1; j > 0; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[0] = temp;
        }
    }
}