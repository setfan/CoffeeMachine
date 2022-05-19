import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int ten = 10;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number < ten);
    }
}