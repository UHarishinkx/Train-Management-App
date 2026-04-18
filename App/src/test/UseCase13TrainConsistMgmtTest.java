import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase13TrainConsistMgmtTest {

    @Test
    void testLoopTimeEmpty() {
        List<UseCase13TrainConsistMgmt.Bogie> list = new ArrayList<>();
        long time = UseCase13TrainConsistMgmt.loopTime(list);
        assertTrue(time >= 0);
    }

    @Test
    void testStreamTimeEmpty() {
        List<UseCase13TrainConsistMgmt.Bogie> list = new ArrayList<>();
        long time = UseCase13TrainConsistMgmt.streamTime(list);
        assertTrue(time >= 0);
    }

    @Test
    void testLoopTimeSingleElement() {
        List<UseCase13TrainConsistMgmt.Bogie> list = List.of(new UseCase13TrainConsistMgmt.Bogie(70));
        long time = UseCase13TrainConsistMgmt.loopTime(list);
        assertTrue(time >= 0);
    }

    @Test
    void testStreamTimeSingleElement() {
        List<UseCase13TrainConsistMgmt.Bogie> list = List.of(new UseCase13TrainConsistMgmt.Bogie(70));
        long time = UseCase13TrainConsistMgmt.streamTime(list);
        assertTrue(time >= 0);
    }

    @Test
    void testLoopTimeMultipleElements() {
        List<UseCase13TrainConsistMgmt.Bogie> list = List.of(
            new UseCase13TrainConsistMgmt.Bogie(70), new UseCase13TrainConsistMgmt.Bogie(50),
            new UseCase13TrainConsistMgmt.Bogie(80), new UseCase13TrainConsistMgmt.Bogie(40)
        );
        long time = UseCase13TrainConsistMgmt.loopTime(list);
        assertTrue(time >= 0);
    }

    @Test
    void testStreamTimeMultipleElements() {
        List<UseCase13TrainConsistMgmt.Bogie> list = List.of(
            new UseCase13TrainConsistMgmt.Bogie(70), new UseCase13TrainConsistMgmt.Bogie(50),
            new UseCase13TrainConsistMgmt.Bogie(80), new UseCase13TrainConsistMgmt.Bogie(40)
        );
        long time = UseCase13TrainConsistMgmt.streamTime(list);
        assertTrue(time >= 0);
    }

    @Test
    void testBothMethodsTypeCompatibility() {
        List<UseCase13TrainConsistMgmt.Bogie> list = List.of(
            new UseCase13TrainConsistMgmt.Bogie(70), new UseCase13TrainConsistMgmt.Bogie(50)
        );
        long loopTime = UseCase13TrainConsistMgmt.loopTime(list);
        long streamTime = UseCase13TrainConsistMgmt.streamTime(list);
        assertTrue(loopTime >= 0 && streamTime >= 0);
    }
}
