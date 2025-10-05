import java.util.Comparator;

public class CustomComparator implements Comparator<int[]>{
    @Override
    public int compare(int[] arr1, int[] arr2) {
        return Integer.compare(arr1[1], arr2[1]);
    }
}
