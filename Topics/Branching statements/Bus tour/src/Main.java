import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();

        String output = "Will not crash";
        int bridgeHeight;

        for (int i = 1; i <= numberOfBridges; i++) {
            bridgeHeight = scanner.nextInt();

            if (busHeight >= bridgeHeight) {
                output = "\nWill crash on bridge " + i;
                break;
            }
        }

        System.out.println(output);
    }
}