import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase15TrainConsistMgmtTest {

    @Test
    void testSafeAssignment() {
        UseCase15TrainConsistMgmt.Bogie bogie = new UseCase15TrainConsistMgmt.Bogie("Cylindrical");
        bogie.assign("Petroleum");
    }

    @Test
    void testSafeAssignmentDifferentCargo() {
        UseCase15TrainConsistMgmt.Bogie bogie = new UseCase15TrainConsistMgmt.Bogie("Rectangular");
        bogie.assign("Grain");
    }

    @Test
    void testUnsafeAssignment() {
        UseCase15TrainConsistMgmt.Bogie bogie = new UseCase15TrainConsistMgmt.Bogie("Rectangular");
        bogie.assign("Petroleum");
    }

    @Test
    void testMultipleAssignments() {
        UseCase15TrainConsistMgmt.Bogie bogie = new UseCase15TrainConsistMgmt.Bogie("Cylindrical");
        bogie.assign("Coal");
        bogie.assign("Grain");
        bogie.assign("Steel");
    }

    @Test
    void testBogieCreation() {
        UseCase15TrainConsistMgmt.Bogie bogie = new UseCase15TrainConsistMgmt.Bogie("Flat");
        assertEquals("Flat", bogie.getType());
    }

    @Test
    void testUnsafeAssignmentCaught() {
        UseCase15TrainConsistMgmt.Bogie bogie = new UseCase15TrainConsistMgmt.Bogie("Rectangular");
        assertDoesNotThrow(() -> bogie.assign("Petroleum"));
    }

    @Test
    void testFinallyBlockExecution() {
        UseCase15TrainConsistMgmt.Bogie bogie = new UseCase15TrainConsistMgmt.Bogie("Rectangular");
        bogie.assign("Petroleum");
    }
}
