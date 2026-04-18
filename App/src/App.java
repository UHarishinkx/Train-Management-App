import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("UC4 - Ordered Train");

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert at position
        train.add(2, "Pantry");

        // Remove first & last
        train.removeFirst();
        train.removeLast();

        System.out.println("Final Train: " + train);
    }
}