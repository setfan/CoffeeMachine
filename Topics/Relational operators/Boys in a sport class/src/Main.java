import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean ascending = h1 <= h2 && h2 <= h3;
        boolean descending = h1 >= h2 && h2 >= h3;


        System.out.println(ascending || descending);
    }
}