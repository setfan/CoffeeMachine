import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean statement1 = num1 >= num2 && num1 <= num3;
        boolean statement2 = num1 <= num2 && num1 >= num3;


        System.out.println(statement1 || statement2);
    }
}