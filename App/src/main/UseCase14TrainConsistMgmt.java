public class UseCase14TrainConsistMgmt {

    public static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String msg) { super(msg); }
    }

    public static class Bogie {
        int capacity;

        public Bogie(int c) throws InvalidCapacityException {
            if (c <= 0) throw new InvalidCapacityException("Invalid capacity");
            capacity = c;
        }
        
        public int getCapacity() { return capacity; }
    }
}
