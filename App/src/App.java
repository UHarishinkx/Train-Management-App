import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("UC3 - Unique Bogie IDs");

        Set<String> ids = new HashSet<>();

        ids.add("BG101");
        ids.add("BG102");
        ids.add("BG103");
        ids.add("BG101"); // duplicate
        ids.add("BG102"); // duplicate

        System.out.println("Unique IDs: " + ids);
    }
}