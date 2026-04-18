import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase17TrainConsistMgmtTest {

    @Test
    void testSortRandomNames() {
        String[] names = {"Charlie", "Alice", "Bob", "David"};
        String[] expected = {"Alice", "Bob", "Charlie", "David"};
        String[] result = UseCase17TrainConsistMgmt.sortNames(names);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSortAlreadySorted() {
        String[] names = {"Alice", "Bob", "Charlie"};
        String[] expected = {"Alice", "Bob", "Charlie"};
        String[] result = UseCase17TrainConsistMgmt.sortNames(names);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSortReverseSorted() {
        String[] names = {"Delta", "Charlie", "Bob", "Alice"};
        String[] expected = {"Alice", "Bob", "Charlie", "Delta"};
        String[] result = UseCase17TrainConsistMgmt.sortNames(names);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSortWithDuplicates() {
        String[] names = {"Bob", "Alice", "Bob", "Charlie"};
        String[] expected = {"Alice", "Bob", "Bob", "Charlie"};
        String[] result = UseCase17TrainConsistMgmt.sortNames(names);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSortSingleElement() {
        String[] names = {"Alice"};
        String[] expected = {"Alice"};
        String[] result = UseCase17TrainConsistMgmt.sortNames(names);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSortCaseSensitive() {
        String[] names = {"bob", "Alice", "CHARLIE"};
        String[] expected = {"Alice", "CHARLIE", "bob"};
        String[] result = UseCase17TrainConsistMgmt.sortNames(names);
        assertArrayEquals(expected, result);
    }

    @Test
    void testSortWithNumbers() {
        String[] names = {"Train1", "Train10", "Train2"};
        String[] expected = {"Train1", "Train10", "Train2"};
        String[] result = UseCase17TrainConsistMgmt.sortNames(names);
        assertArrayEquals(expected, result);
    }
}
