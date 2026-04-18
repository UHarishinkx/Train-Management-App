import java.util.*;

public class UseCase12TrainConsistMgmt {

    public static class Bogie {
        String type, cargo;
        
        public Bogie(String t, String c) { 
            type = t; 
            cargo = c; 
        }
    }

    /**
     * UC12: Stream allMatch
     * Validates that all bogies are safe
     * A bogie is safe if it's not Cylindrical OR if it carries Petroleum
     */
    public static boolean isSafe(List<Bogie> list) {
        return list.stream().allMatch(b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));
    }
}
