import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sequenceLength = 1;

        int bestSequenceLength = 1;

        for (int i = 1; i < numbers.length; i++) {
            if ((numbers[i]) > numbers[i - 1]) {
                sequenceLength++;

                if (sequenceLength > bestSequenceLength) {
                    bestSequenceLength = sequenceLength;

                }
            } else {
                sequenceLength = 1;

            }
        }

        System.out.println(bestSequenceLength);
    }
}