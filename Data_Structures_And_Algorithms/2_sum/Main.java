import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums  = {12, 23 , 34 , 15};
        int target = 49;
        int[] result = solution.twoSum(nums , target);
        System.out.println(Arrays.toString(result));
    }
}
