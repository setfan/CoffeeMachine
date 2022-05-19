import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int one = 1;
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt() + one;

        System.out.println(input.substring(startIndex, endIndex));

    }
}