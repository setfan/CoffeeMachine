import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStudents = scanner.nextInt();
        String grade;

        int aGrades = 0;
        int bGrades = 0;
        int cGrades = 0;
        int dGrades = 0;

        for (int i = 0; i < numberStudents; i++) {
            grade = scanner.next();
            if ("A".equals(grade)) {
                aGrades++;
            } else if ("B".equals(grade)) {
                bGrades++;
            } else if ("C".equals(grade)) {
                cGrades++;
            } else {
                dGrades++;
            }
        }

        System.out.println(dGrades + " " + cGrades + " " + bGrades + " " + aGrades);

    }
}