import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();

        StringBuilder reverseNumber = new StringBuilder();

        reverseNumber.append(number);
        reverseNumber.reverse();

        int result = Integer.parseInt(String.valueOf(reverseNumber));

        System.out.println(result);

    }
}