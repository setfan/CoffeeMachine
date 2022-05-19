import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int four = 4;
        int iterator = scanner.nextInt();
        int num;
        int maxByFour = four;

        while (iterator > 0) {
            num = scanner.nextInt();

            maxByFour = num % four == 0 ? Math.max(maxByFour, num) : maxByFour;

            iterator--;
        }

        System.out.println(maxByFour);
    }
}