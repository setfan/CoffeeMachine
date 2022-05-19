import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int[] sortedNumbers = new int[size];


        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sortedNumbers[i] = numbers[i];
        }
        sortArray(sortedNumbers);

        System.out.println(Arrays.equals(sortedNumbers, numbers));
    }

    private static void sortArray(int[] array) {
        Arrays.sort(array);
    }

}