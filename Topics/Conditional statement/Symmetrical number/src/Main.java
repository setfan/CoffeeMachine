import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int thousand = 1000;
        final int hundred = 100;
        final int ten = 10;
        final int one = 1;
        final int min = 2;
        final int max = 99_999;


        int num = scanner.nextInt();

        int currentNumber;
        int thousands = num / thousand;
        currentNumber = num % thousand;
        int hundreds = currentNumber / hundred;
        currentNumber = currentNumber % hundred;
        int tens = currentNumber / ten;
        currentNumber = currentNumber % ten;
        int digits = currentNumber;


        if (thousands == digits && hundreds == tens) {
            System.out.println(one);
        } else {
            //Generate random int value from 2 to 99_999
            int randomInt = (int) Math.floor(Math.random() * (max - min + one) + min);
            System.out.println(randomInt);
        }
    }
}