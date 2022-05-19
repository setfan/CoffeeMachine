import java.util.*;

public class Main {
    public static void main(String[] args) {
        final double percents = 100;
        Scanner scanner = new Scanner(System.in);

        int companies = scanner.nextInt();
        int[] income = new int[companies];
        int[] taxes = new int[companies];

        for (int i = 0; i < companies; i++) {
            income[i] = scanner.nextInt();
        }

        for (int i = 0; i < companies; i++) {
            taxes[i] = scanner.nextInt();
        }

        int biggestTaxesCompany = 1;
        double biggestTaxes = 0;


        for (int i = 0; i < companies; i++) {
            double currentTaxes = income[i] * taxes[i] / percents;

            if (currentTaxes > biggestTaxes) {
                biggestTaxes = currentTaxes;

                biggestTaxesCompany = i + 1;
            }
        }

        System.out.println(biggestTaxesCompany);

    }

}