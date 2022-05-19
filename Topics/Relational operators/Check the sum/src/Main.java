import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int twenty = 20;
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean isTwentyPair1 = num1 + num2 == twenty;
        boolean isTwentyPair2 = num2 + num3 == twenty;
        boolean isTwentyPair3 = num1 + num3 == twenty;


        System.out.println(isTwentyPair1 || isTwentyPair2 || isTwentyPair3);
    }
}