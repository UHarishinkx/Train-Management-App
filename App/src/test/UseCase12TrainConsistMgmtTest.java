import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase12TrainConsistMgmtTest {

    @Test
    void testSafeNonCylindricalBogies() {
        List<UseCase12TrainConsistMgmt.Bogie> list = List.of(
            new UseCase12TrainConsistMgmt.Bogie("Rectangular", "Grain"),
            new UseCase12TrainConsistMgmt.Bogie("Flat", "Steel")
        );
        assertTrue(UseCase12TrainConsistMgmt.isSafe(list));
    }

    @Test
    void testSafeCylindricalWithPetroleum() {
        List<UseCase12TrainConsistMgmt.Bogie> list = List.of(
            new UseCase12TrainConsistMgmt.Bogie("Cylindrical", "Petroleum"),
            new UseCase12TrainConsistMgmt.Bogie("Rectangular", "Grain")
        );
        assertTrue(UseCase12TrainConsistMgmt.isSafe(list));
    }

    @Test
    void testUnsafeCylindricalWithNonPetroleum() {
        List<UseCase12TrainConsistMgmt.Bogie> list = List.of(
            new UseCase12TrainConsistMgmt.Bogie("Cylindrical", "Coal")
        );
        assertFalse(UseCase12TrainConsistMgmt.isSafe(list));
    }

    @Test
    void testEmptyList() {
        List<UseCase12TrainConsistMgmt.Bogie> list = new ArrayList<>();
        assertTrue(UseCase12TrainConsistMgmt.isSafe(list));
    }

    @Test
    void testOnlyCylindricalPetroleum() {
        List<UseCase12TrainConsistMgmt.Bogie> list = List.of(
            new UseCase12TrainConsistMgmt.Bogie("Cylindrical", "Petroleum"),
            new UseCase12TrainConsistMgmt.Bogie("Cylindrical", "Petroleum")
        );
        assertTrue(UseCase12TrainConsistMgmt.isSafe(list));
    }

    @Test
    void testMixedSafeAndUnsafe() {
        List<UseCase12TrainConsistMgmt.Bogie> list = List.of(
            new UseCase12TrainConsistMgmt.Bogie("Rectangular", "Grain"),
            new UseCase12TrainConsistMgmt.Bogie("Cylindrical", "Coal")
        );
        assertFalse(UseCase12TrainConsistMgmt.isSafe(list));
    }
}
