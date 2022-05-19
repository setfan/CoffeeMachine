import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.next();
        double a;
        double b;
        double area;

        switch (figure) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;

                break;

            case "circle":
                double r = scanner.nextDouble();
                area = pi * (r * r);

                break;
            default:
                System.out.println("error!");
                return;
        }

        System.out.println(area);

    }
}