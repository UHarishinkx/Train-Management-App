import java.util.*;

public class UseCase10TrainConsistMgmt {

    public static class Bogie {
        int capacity;
        
        public Bogie(int capacity) { 
            this.capacity = capacity; 
        }
        
        public int getCapacity() {
            return capacity;
        }
    }

    /**
     * UC10: Stream Reduce
     * Calculates total capacity of all bogies using reduce operation
     * Returns sum of all capacities
     * 
     * @param list List of bogies
     * @return Total capacity of all bogies
     */
    public static int totalCapacity(List<Bogie> list) {
        return list.stream()
                   .map(b -> b.capacity)
                   .reduce(0, Integer::sum);
    }
}
