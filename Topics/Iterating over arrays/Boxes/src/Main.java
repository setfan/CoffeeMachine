import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] box1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] box2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        System.out.println(boxFitting(box1, box2));

    }

    private static String boxFitting(int[] box1, int[] box2) {
        if (box1[0] > box2[0] && box1[1] > box2[1] && box1[2] > box2[2]) {
            return "Box 1 > Box 2";
        } else if (box2[0] > box1[0] && box2[1] > box1[1] && box2[2] > box1[2]) {
            return "Box 1 < Box 2";
        } else if (box1[0] > box2[2] && box1[1] > box2[1] && box1[2] > box2[0]) {
            return "Box 1 > Box 2";
        } else if (box2[0] > box1[2] && box2[1] > box1[1] && box2[0] > box1[0]) {
            return "Box 1 > Box 2";
        }
        return "Incompatible";
    }
}

