import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int noArmy = 1;
        final int pack = 19;
        final int throng = 249;
        final int zounds = 999;
        Scanner scanner = new Scanner(System.in);
        long numberUnits = scanner.nextLong();

        if (numberUnits < noArmy) {
            System.out.println("no army");
        } else if (numberUnits <= pack) {
            System.out.println("pack");
        } else if (numberUnits <= throng) {
            System.out.println("throng");
        } else if (numberUnits <= zounds) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}