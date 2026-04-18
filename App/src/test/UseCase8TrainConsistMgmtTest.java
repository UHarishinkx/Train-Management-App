import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class UseCase8TrainConsistMgmtTest {
    
    private UseCase8TrainConsistMgmt useCase8;
    private List<UseCase8TrainConsistMgmt.Bogie> testBogies;
    
    @BeforeEach
    public void setUp() {
        useCase8 = new UseCase8TrainConsistMgmt();
        testBogies = new ArrayList<>();
        testBogies.add(new UseCase8TrainConsistMgmt.Bogie("B1", 100));
        testBogies.add(new UseCase8TrainConsistMgmt.Bogie("B2", 60));
        testBogies.add(new UseCase8TrainConsistMgmt.Bogie("B3", 50));
        testBogies.add(new UseCase8TrainConsistMgmt.Bogie("B4", 80));
    }
    
    /**
     * Test 1: Capacity greater than threshold
     */
    @Test
    public void testFilterCapacityGreaterThanThreshold() {
        List<UseCase8TrainConsistMgmt.Bogie> result = useCase8.filterByCapacity(testBogies, 60);
        assertEquals(2, result.size());
        assertTrue(result.stream().allMatch(b -> b.getCapacity() > 60));
    }
    
    /**
     * Test 2: Capacity equal to threshold (should NOT include)
     */
    @Test
    public void testFilterCapacityEqualToThreshold() {
        List<UseCase8TrainConsistMgmt.Bogie> result = useCase8.filterByCapacity(testBogies, 60);
        assertEquals(2, result.size());
        assertFalse(result.stream().anyMatch(b -> b.getCapacity() == 60));
    }
    
    /**
     * Test 3: Capacity less than threshold
     */
    @Test
    public void testFilterCapacityLessThanThreshold() {
        List<UseCase8TrainConsistMgmt.Bogie> result = useCase8.filterByCapacity(testBogies, 80);
        assertEquals(1, result.size());
        assertEquals(100, result.get(0).getCapacity());
    }
    
    /**
     * Test 4: Empty list handling
     */
    @Test
    public void testFilterEmptyList() {
        List<UseCase8TrainConsistMgmt.Bogie> result = useCase8.filterByCapacity(new ArrayList<>(), 60);
        assertTrue(result.isEmpty());
    }
    
    /**
     * Test 5: Original list remains unchanged
     */
    @Test
    public void testOriginalListUnchanged() {
        int originalSize = testBogies.size();
        useCase8.filterByCapacity(testBogies, 60);
        assertEquals(originalSize, testBogies.size());
    }
    
    /**
     * Test 6: Null list handling
     */
    @Test
    public void testFilterNullList() {
        List<UseCase8TrainConsistMgmt.Bogie> result = useCase8.filterByCapacity(null, 60);
        assertTrue(result.isEmpty());
    }
}
