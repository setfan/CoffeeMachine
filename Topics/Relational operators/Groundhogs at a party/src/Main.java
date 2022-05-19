import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int minDalyCups = 10;
        final int maxDalyCups = 20;

        final int minWeekendCups = 15;
        final int maxWeekendCups = 25;

        Scanner scanner = new Scanner(System.in);

        int numberOfCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean wasDalyPartyGood = numberOfCups >= minDalyCups && numberOfCups <= maxDalyCups && !isWeekend;
        boolean wasWeekendPartyGood = numberOfCups >= minWeekendCups && numberOfCups <= maxWeekendCups && isWeekend;

        System.out.println(wasDalyPartyGood || wasWeekendPartyGood);
    }
}