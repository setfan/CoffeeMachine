import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int square = 1;
        int iterator = 1;

        while (square <= n) {
            System.out.println(square);
            iterator++;
            square = iterator * iterator;
        }
    }
}