import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        System.out.println(line1.trim().replaceAll(" ", "")
                .equals(line2.trim().replaceAll(" ", "")));
    }
}