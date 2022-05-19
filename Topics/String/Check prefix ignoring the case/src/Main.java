import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Boolean output = input.toUpperCase().startsWith("J");

        System.out.println(output);
    }
}