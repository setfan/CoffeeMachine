import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String yearsExperience = scanner.next();
        String cuisinePreference = scanner.next();

        System.out.printf("The form for %s is completed. " +
                "We will contact you if we need a chef who cooks %s dishes " +
                "and has %s years of experience.%n%n", name, cuisinePreference, yearsExperience);
    }
}