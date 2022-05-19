import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();

        while (input.length() > 0) {
            output.append(input);
            output.append(" ");
            try {
                input = scanner.nextLine();
            } catch (Exception e) {
                break;
            }
        }
        String[] separatedOutput = output.toString().split("\\s+");

        for (int i = separatedOutput.length - 1; i >= 0; i--) {
            System.out.println(separatedOutput[i]);
        }
    }
}
