import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainConsistMgmtTest {

    /**
     * Test 1: Valid train ID
     */
    @Test
    void testValidTrainId() {
        assertTrue(UseCase11TrainConsistMgmt.validateTrainId("TRN-1234"));
    }

    /**
     * Test 2: Invalid train ID - missing prefix
     */
    @Test
    void testInvalidTrainIdMissingPrefix() {
        assertFalse(UseCase11TrainConsistMgmt.validateTrainId("1234"));
    }

    /**
     * Test 3: Invalid train ID - wrong prefix
     */
    @Test
    void testInvalidTrainIdWrongPrefix() {
        assertFalse(UseCase11TrainConsistMgmt.validateTrainId("TRAIN-1234"));
    }

    /**
     * Test 4: Invalid train ID - non-digit characters
     */
    @Test
    void testInvalidTrainIdNonDigits() {
        assertFalse(UseCase11TrainConsistMgmt.validateTrainId("TRN-ABCD"));
    }

    /**
     * Test 5: Invalid train ID - too many digits
     */
    @Test
    void testInvalidTrainIdTooManyDigits() {
        assertFalse(UseCase11TrainConsistMgmt.validateTrainId("TRN-12345"));
    }

    /**
     * Test 6: Invalid train ID - too few digits
     */
    @Test
    void testInvalidTrainIdTooFewDigits() {
        assertFalse(UseCase11TrainConsistMgmt.validateTrainId("TRN-123"));
    }

    /**
     * Test 7: Valid cargo code
     */
    @Test
    void testValidCargoCode() {
        assertTrue(UseCase11TrainConsistMgmt.validateCargo("PET-AB"));
    }

    /**
     * Test 8: Valid cargo code - all letters
     */
    @Test
    void testValidCargoCodeAllLetters() {
        assertTrue(UseCase11TrainConsistMgmt.validateCargo("PET-XY"));
    }

    /**
     * Test 9: Invalid cargo code - missing prefix
     */
    @Test
    void testInvalidCargoCodeMissingPrefix() {
        assertFalse(UseCase11TrainConsistMgmt.validateCargo("AB"));
    }

    /**
     * Test 10: Invalid cargo code - wrong prefix
     */
    @Test
    void testInvalidCargoCodeWrongPrefix() {
        assertFalse(UseCase11TrainConsistMgmt.validateCargo("CARGO-AB"));
    }

    /**
     * Test 11: Invalid cargo code - lowercase letters
     */
    @Test
    void testInvalidCargoCodeLowercase() {
        assertFalse(UseCase11TrainConsistMgmt.validateCargo("PET-ab"));
    }

    /**
     * Test 12: Invalid cargo code - digits instead of letters
     */
    @Test
    void testInvalidCargoCodeDigits() {
        assertFalse(UseCase11TrainConsistMgmt.validateCargo("PET-12"));
    }

    /**
     * Test 13: Invalid cargo code - too many letters
     */
    @Test
    void testInvalidCargoCodeTooMany() {
        assertFalse(UseCase11TrainConsistMgmt.validateCargo("PET-ABC"));
    }

    /**
     * Test 14: Invalid cargo code - too few letters
     */
    @Test
    void testInvalidCargoCodeTooFew() {
        assertFalse(UseCase11TrainConsistMgmt.validateCargo("PET-A"));
    }

    /**
     * Test 15: Empty strings
     */
    @Test
    void testEmptyStrings() {
        assertFalse(UseCase11TrainConsistMgmt.validateTrainId(""));
        assertFalse(UseCase11TrainConsistMgmt.validateCargo(""));
    }
}
