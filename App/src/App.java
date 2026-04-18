import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("UC2 - Add Passenger Bogies");

        List<String> bogies = new ArrayList<>();

        // Add
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After adding: " + bogies);

        // Remove
        bogies.remove("AC Chair");

        System.out.println("After removing AC Chair: " + bogies);

        // Contains
        System.out.println("Contains Sleeper? " + bogies.contains("Sleeper"));

        System.out.println("Final: " + bogies);
    }
}