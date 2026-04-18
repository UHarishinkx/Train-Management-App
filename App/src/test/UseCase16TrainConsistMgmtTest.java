import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase16TrainConsistMgmtTest {

    @Test
    void testSortRandomArray() {
int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        UseCase16TrainConsistMgmt.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        UseCase16TrainConsistMgmt.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        UseCase16TrainConsistMgmt.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortWithDuplicates() {
        int[] arr = {3, 1, 3, 2, 1};
        int[] expected = {1, 1, 2, 3, 3};
        UseCase16TrainConsistMgmt.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortSingleElement() {
        int[] arr = {5};
        int[] expected = {5};
        UseCase16TrainConsistMgmt.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortTwoElements() {
        int[] arr = {2, 1};
        int[] expected = {1, 2};
        UseCase16TrainConsistMgmt.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortNegativeNumbers() {
        int[] arr = {3, -1, 4, -5, 2};
        int[] expected = {-5, -1, 2, 3, 4};
        UseCase16TrainConsistMgmt.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSortZeros() {
        int[] arr = {0, 0, 0};
        int[] expected = {0, 0, 0};
        UseCase16TrainConsistMgmt.sort(arr);
        assertArrayEquals(expected, arr);
    }
}
