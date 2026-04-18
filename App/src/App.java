import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("UC5 - Ordered Unique Bogies");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate

        System.out.println("Final Formation: " + formation);
    }
}