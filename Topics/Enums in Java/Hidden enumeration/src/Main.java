public class Main {

    public static void main(String[] args) {
        int counter = 0;

        for (Secret elem : Secret.values()) {
            if (elem.name().startsWith("STAR")) {
                counter++;
            }
        }

        System.out.println(counter);

    }
}

/* sample enum for inspiration
enum Secret {
    STAR, CRASH, START, // ...
}
*/