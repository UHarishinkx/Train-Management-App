import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    @Test
    void testFilter() {
        List<UseCase8TrainConsistMgmt.Bogie> list = List.of(
                new UseCase8TrainConsistMgmt.Bogie("Sleeper", 70),
                new UseCase8TrainConsistMgmt.Bogie("AC", 50)
        );

        List<?> result = UseCase8TrainConsistMgmt.filterBogies(list, 60);
        assertEquals(1, result.size());
    }
}