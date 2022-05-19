import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input += " " + scanner.nextLine();
        input += " " + scanner.nextLine();

        String[] output = input.split("\\s+");

        for (String word : output
        ) {
            System.out.println(word);
        }
    }
}