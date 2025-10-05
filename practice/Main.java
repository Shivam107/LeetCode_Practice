import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 7},
            {77, 2},
            {67, 1},
            {66, 10}
        };
        
        CustomComparator customComparator = new CustomComparator();
        Arrays.sort(arr, customComparator);
        System.out.println(Arrays.toString(arr));
    }
}
