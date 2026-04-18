import java.util.*;

public class UseCase19TrainConsistMgmt {

    public static int search(int[] arr, int key) {
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, key);
    }
}
