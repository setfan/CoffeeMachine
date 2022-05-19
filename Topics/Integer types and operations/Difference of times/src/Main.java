import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int secondsPerHour = 3600;
        final int secondsPerMinute = 60;

        int hoursStart = scanner.nextInt();
        int minutesStart = scanner.nextInt();
        int secondsStart = scanner.nextInt();

        int hoursEnd = scanner.nextInt();
        int minutesEnd = scanner.nextInt();
        int secondsEnd = scanner.nextInt();

        int result = (hoursEnd - hoursStart) * secondsPerHour
                + (minutesEnd - minutesStart) * secondsPerMinute + (secondsEnd - secondsStart);

        System.out.println(result);


    }
}