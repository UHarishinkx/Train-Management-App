import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase20TrainConsistMgmtTest {

    @Test
    void testSearchElementFound() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, UseCase20TrainConsistMgmt.search(arr, 1));
    }

    @Test
    void testSearchElementInMiddle() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, UseCase20TrainConsistMgmt.search(arr, 3));
    }

    @Test
    void testSearchElementAtEnd() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(4, UseCase20TrainConsistMgmt.search(arr, 5));
    }

    @Test
    void testSearchElementNotFoundThrows() {
        int[] arr = {1, 2, 3, 4, 5};
        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            UseCase20TrainConsistMgmt.search(arr, 10);
        });
        assertEquals("Not Found", ex.getMessage());
    }

    @Test
    void testSearchEmptyArrayThrows() {
        int[] arr = {};
        assertThrows(RuntimeException.class, () -> {
            UseCase20TrainConsistMgmt.search(arr, 1);
        });
    }

    @Test
    void testSearchSingleElement() {
        int[] arr = {42};
        assertEquals(0, UseCase20TrainConsistMgmt.search(arr, 42));
    }

    @Test
    void testSearchNegativeNumbers() {
        int[] arr = {-5, -3, 0, 3, 5};
        assertEquals(1, UseCase20TrainConsistMgmt.search(arr, -3));
    }

    @Test
    void testSearchExceptionMessage() {
        int[] arr = {1, 2, 3};
        RuntimeException ex = assertThrows(RuntimeException.class, () -> {
            UseCase20TrainConsistMgmt.search(arr, 100);
        });
        assertTrue(ex.getMessage().contains("Not Found"));
    }
}
