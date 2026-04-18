import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmt {
    
    /**
     * UC8: Stream Filtering
     * Filters train consist (bogies) based on capacity threshold
     * Returns a list of bogies with capacity > threshold
     * 
     * @param bogies List of bogie objects with capacity info
     * @param threshold Minimum capacity threshold
     * @return List of filtered bogies
     */
    public List<Bogie> filterByCapacity(List<Bogie> bogies, int threshold) {
        if (bogies == null || bogies.isEmpty()) {
            return new ArrayList<>();
        }
        
        return bogies.stream()
                     .filter(b -> b.getCapacity() > threshold)
                     .collect(Collectors.toList());
    }
    
    /**
     * Inner class representing a train bogie
     */
    public static class Bogie {
        private String id;
        private int capacity;
        
        public Bogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }
        
        public String getId() {
            return id;
        }
        
        public int getCapacity() {
            return capacity;
        }
        
        @Override
        public String toString() {
            return "Bogie{" + "id='" + id + '\'' + ", capacity=" + capacity + '}';
        }
    }
}
