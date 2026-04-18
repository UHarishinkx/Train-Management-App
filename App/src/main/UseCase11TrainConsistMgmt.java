import java.util.regex.*;

public class UseCase11TrainConsistMgmt {

    /**
     * UC11: Regex Validation
     * Validates Train ID format: TRN-XXXX (where X is digit)
     * 
     * @param id Train ID to validate
     * @return true if format matches TRN-\d{4}, false otherwise
     */
    public static boolean validateTrainId(String id) {
        return Pattern.matches("TRN-\\d{4}", id);
    }

    /**
     * Validates Cargo code format: PET-XX (where X is uppercase letter)
     * 
     * @param code Cargo code to validate
     * @return true if format matches PET-[A-Z]{2}, false otherwise
     */
    public static boolean validateCargo(String code) {
        return Pattern.matches("PET-[A-Z]{2}", code);
    }
}
