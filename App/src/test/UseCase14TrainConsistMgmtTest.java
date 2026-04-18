import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase14TrainConsistMgmtTest {

    @Test
    void testValidCapacity() throws UseCase14TrainConsistMgmt.InvalidCapacityException {
        UseCase14TrainConsistMgmt.Bogie bogie = new UseCase14TrainConsistMgmt.Bogie(100);
        assertEquals(100, bogie.getCapacity());
    }

    @Test
    void testValidCapacityMinimum() throws UseCase14TrainConsistMgmt.InvalidCapacityException {
        UseCase14TrainConsistMgmt.Bogie bogie = new UseCase14TrainConsistMgmt.Bogie(1);
        assertEquals(1, bogie.getCapacity());
    }

    @Test
    void testInvalidCapacityZero() {
        assertThrows(UseCase14TrainConsistMgmt.InvalidCapacityException.class, () -> {
            new UseCase14TrainConsistMgmt.Bogie(0);
        });
    }

    @Test
    void testInvalidCapacityNegative() {
        assertThrows(UseCase14TrainConsistMgmt.InvalidCapacityException.class, () -> {
            new UseCase14TrainConsistMgmt.Bogie(-50);
        });
    }

    @Test
    void testExceptionMessage() {
        UseCase14TrainConsistMgmt.InvalidCapacityException ex = 
            assertThrows(UseCase14TrainConsistMgmt.InvalidCapacityException.class, () -> {
                new UseCase14TrainConsistMgmt.Bogie(-1);
            });
        assertEquals("Invalid capacity", ex.getMessage());
    }

    @Test
    void testValidCapacityLarge() throws UseCase14TrainConsistMgmt.InvalidCapacityException {
        UseCase14TrainConsistMgmt.Bogie bogie = new UseCase14TrainConsistMgmt.Bogie(10000);
        assertEquals(10000, bogie.getCapacity());
    }
}
