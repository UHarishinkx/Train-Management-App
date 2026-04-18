import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase9TrainConsistMgmtTest {

    @Test
    void testGroupingByName() {
        List<UseCase9TrainConsistMgmt.Bogie> bogies = List.of(
                new UseCase9TrainConsistMgmt.Bogie("Sleeper"),
                new UseCase9TrainConsistMgmt.Bogie("AC"),
                new UseCase9TrainConsistMgmt.Bogie("Sleeper"),
                new UseCase9TrainConsistMgmt.Bogie("General")
        );

        Map<String, List<UseCase9TrainConsistMgmt.Bogie>> grouped = 
            UseCase9TrainConsistMgmt.group(bogies);

        assertEquals(3, grouped.size());
        assertEquals(2, grouped.get("Sleeper").size());
        assertEquals(1, grouped.get("AC").size());
        assertEquals(1, grouped.get("General").size());
    }

    @Test
    void testGroupingEmpty() {
        List<UseCase9TrainConsistMgmt.Bogie> bogies = new ArrayList<>();
        Map<String, List<UseCase9TrainConsistMgmt.Bogie>> grouped = 
            UseCase9TrainConsistMgmt.group(bogies);
        assertTrue(grouped.isEmpty());
    }
}