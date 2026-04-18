import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class App {
    public static void main(String[] args) {

        System.out.println("UC7 - Sort by Capacity");

        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));

        // Sort using Comparator
        list.sort(Comparator.comparingInt(b -> b.capacity));

        for (Bogie b : list) {
            System.out.println(b);
        }
    }
}