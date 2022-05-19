import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean areNotPresent = true;


        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] == n && numbers[i + 1] == m) {
                areNotPresent = false;
                break;
            } else if (numbers[i] == m && numbers[i + 1] == n) {
                areNotPresent = false;
                break;
            }
        }

        System.out.println(areNotPresent);
    }
}