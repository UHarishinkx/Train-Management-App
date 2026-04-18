import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase18TrainConsistMgmtTest {

    @Test
    void testSearchElementAtBeginning() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, UseCase18TrainConsistMgmt.search(arr, 1));
    }

    @Test
    void testSearchElementAtEnd() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(4, UseCase18TrainConsistMgmt.search(arr, 5));
    }

    @Test
    void testSearchElementInMiddle() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, UseCase18TrainConsistMgmt.search(arr, 3));
    }

    @Test
    void testSearchElementNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, UseCase18TrainConsistMgmt.search(arr, 10));
    }

    @Test
    void testSearchEmptyArray() {
        int[] arr = {};
        assertEquals(-1, UseCase18TrainConsistMgmt.search(arr, 1));
    }

    @Test
    void testSearchSingleElement() {
        int[] arr = {42};
        assertEquals(0, UseCase18TrainConsistMgmt.search(arr, 42));
    }

    @Test
    void testSearchNegativeNumbers() {
        int[] arr = {-5, -3, 0, 3, 5};
        assertEquals(1, UseCase18TrainConsistMgmt.search(arr, -3));
    }

    @Test
    void testSearchDuplicates() {
        int[] arr = {1, 2, 2, 3, 2};
        assertEquals(1, UseCase18TrainConsistMgmt.search(arr, 2));
    }
}
