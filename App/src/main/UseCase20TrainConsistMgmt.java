public class UseCase20TrainConsistMgmt {

    /**
     * UC20: Linear Search with Exception
     * Searches for key in array
     * Throws RuntimeException if element not found
     */
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;

        throw new RuntimeException("Not Found");
    }
}
