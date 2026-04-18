import java.util.*;
import java.util.stream.*;

public class UseCase9TrainConsistMgmt {

    public static class Bogie {
        public String name;
        
        public Bogie(String name) { 
            this.name = name; 
        }
    }

    public static Map<String, List<Bogie>> group(List<Bogie> list) {
        return list.stream().collect(Collectors.groupingBy(b -> b.name));
    }
}