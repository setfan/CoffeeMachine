import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int maxNum = 1;

        do {
            input = scanner.nextInt();
            maxNum = Math.max(maxNum, input);
        } while (input != 0);

        System.out.println(maxNum);
    }
}