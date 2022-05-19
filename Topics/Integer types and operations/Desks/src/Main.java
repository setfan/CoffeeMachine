import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final short maxStudentsPerDesk = 2;
        final short additionalDesk = 1;

        Scanner scanner = new Scanner(System.in);
        short totalRequiredDesks;
        short additionalDesks = 0;

        short studentsFirstRoom = scanner.nextShort();
        short studentsSecondRoom = scanner.nextShort();
        short studentsThirdRoom = scanner.nextShort();

        if (studentsFirstRoom % 2 > 0) {
            additionalDesks += additionalDesk;
        }
        if (studentsSecondRoom % 2 > 0) {
            additionalDesks += additionalDesk;
        }
        if (studentsThirdRoom % 2 > 0) {
            additionalDesks += additionalDesk;
        }


        totalRequiredDesks = (short) (studentsFirstRoom / maxStudentsPerDesk +
                studentsSecondRoom / maxStudentsPerDesk + studentsThirdRoom / maxStudentsPerDesk);

        totalRequiredDesks += additionalDesks;

        System.out.println(totalRequiredDesks);


    }
}