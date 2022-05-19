import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int lowBoundary1 = -15;
        final int maxBoundary1 = 12;

        final int lowBoundary2 = 14;
        final int maxBoundary2 = 17;

        final int lowBoundary3 = 19;
        final int maxBoundary3 = Integer.MAX_VALUE;

        int num = scanner.nextInt();

        boolean isInInterval1 = num > lowBoundary1 && num <= maxBoundary1;
        boolean isInInterval2 = num > lowBoundary2 && num < maxBoundary2;
        boolean isInInterval3 = num >= lowBoundary3 && num < maxBoundary3;

        if (isInInterval1 || isInInterval2 || isInInterval3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}