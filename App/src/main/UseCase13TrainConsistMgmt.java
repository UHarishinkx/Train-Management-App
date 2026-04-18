import java.util.*;

public class UseCase13TrainConsistMgmt {

    public static class Bogie {
        int capacity;
        
        public Bogie(int c) { capacity = c; }
    }

    public static long loopTime(List<Bogie> list) {
        long start = System.nanoTime();
        for (Bogie b : list) {
            if (b.capacity > 60) {}
        }
        return System.nanoTime() - start;
    }

    public static long streamTime(List<Bogie> list) {
        long start = System.nanoTime();
        list.stream().filter(b -> b.capacity > 60).toList();
        return System.nanoTime() - start;
    }
}
