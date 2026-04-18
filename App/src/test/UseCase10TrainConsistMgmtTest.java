import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmtTest {

    /**
     * Test 1: Normal case - Multiple bogies with different capacities
     */
    @Test
    void testTotalCapacityMultipleBogies() {
        List<UseCase10TrainConsistMgmt.Bogie> bogies = List.of(
            new UseCase10TrainConsistMgmt.Bogie(100),
            new UseCase10TrainConsistMgmt.Bogie(80),
            new UseCase10TrainConsistMgmt.Bogie(60),
            new UseCase10TrainConsistMgmt.Bogie(50)
        );
        
        int total = UseCase10TrainConsistMgmt.totalCapacity(bogies);
        assertEquals(290, total);
    }

    /**
     * Test 2: Single bogie
     */
    @Test
    void testTotalCapacitySingleBogie() {
        List<UseCase10TrainConsistMgmt.Bogie> bogies = List.of(
            new UseCase10TrainConsistMgmt.Bogie(100)
        );
        
        int total = UseCase10TrainConsistMgmt.totalCapacity(bogies);
        assertEquals(100, total);
    }

    /**
     * Test 3: Empty list
     */
    @Test
    void testTotalCapacityEmptyList() {
        List<UseCase10TrainConsistMgmt.Bogie> bogies = new ArrayList<>();
        
        int total = UseCase10TrainConsistMgmt.totalCapacity(bogies);
        assertEquals(0, total);
    }

    /**
     * Test 4: Zero capacity bogies
     */
    @Test
    void testTotalCapacityZeroCapacity() {
        List<UseCase10TrainConsistMgmt.Bogie> bogies = List.of(
            new UseCase10TrainConsistMgmt.Bogie(0),
            new UseCase10TrainConsistMgmt.Bogie(0),
            new UseCase10TrainConsistMgmt.Bogie(0)
        );
        
        int total = UseCase10TrainConsistMgmt.totalCapacity(bogies);
        assertEquals(0, total);
    }

    /**
     * Test 5: Large capacity values
     */
    @Test
    void testTotalCapacityLargeValues() {
        List<UseCase10TrainConsistMgmt.Bogie> bogies = List.of(
            new UseCase10TrainConsistMgmt.Bogie(1000),
            new UseCase10TrainConsistMgmt.Bogie(2000),
            new UseCase10TrainConsistMgmt.Bogie(3000)
        );
        
        int total = UseCase10TrainConsistMgmt.totalCapacity(bogies);
        assertEquals(6000, total);
    }

    /**
     * Test 6: Verify reduce function works correctly
     */
    @Test
    void testTotalCapacityReduceCorrectness() {
        List<UseCase10TrainConsistMgmt.Bogie> bogies = List.of(
            new UseCase10TrainConsistMgmt.Bogie(10),
            new UseCase10TrainConsistMgmt.Bogie(20),
            new UseCase10TrainConsistMgmt.Bogie(30)
        );
        
        int total = UseCase10TrainConsistMgmt.totalCapacity(bogies);
        
        // Verify: 10 + 20 + 30 = 60
        assertEquals(60, total);
    }
}
