import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase19TrainConsistMgmtTest {

    @Test
    void testSearchElementFound() {
        int[] arr = {5, 2, 8, 1, 9};
        int result = UseCase19TrainConsistMgmt.search(arr, 5);
        assertTrue(result >= 0);
    }

    @Test
    void testSearchMultipleElements() {
        int[] arr = {5, 2, 8, 1, 9};
        int result = UseCase19TrainConsistMgmt.search(arr, 8);
        assertTrue(result >= 0);
    }

    @Test
    void testSearchElementNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = UseCase19TrainConsistMgmt.search(arr, 10);
        assertTrue(result < 0);
    }

    @Test
    void testSearchEmptyArray() {
        int[] arr = {};
        int result = UseCase19TrainConsistMgmt.search(arr, 1);
        assertTrue(result < 0);
    }

    @Test
    void testSearchSingleElement() {
        int[] arr = {42};
        int result = UseCase19TrainConsistMgmt.search(arr, 42);
        assertTrue(result >= 0);
    }

    @Test
    void testSearchUnsortedArray() {
        int[] arr = {9, 3, 5, 1, 7};
        int result = UseCase19TrainConsistMgmt.search(arr, 5);
        assertTrue(result >= 0);
    }

    @Test
    void testSearchNegativeNumbers() {
        int[] arr = {5, -3, 10, -8, 0};
        int result = UseCase19TrainConsistMgmt.search(arr, -3);
        assertTrue(result >= 0);
    }

    @Test
    void testSearchFirstElement() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = UseCase19TrainConsistMgmt.search(arr, 1);
        assertTrue(result >= 0);
    }
}
