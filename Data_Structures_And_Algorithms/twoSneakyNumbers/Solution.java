import java.util.HashSet;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {  
        HashSet<Integer> seen = new HashSet<>();
        int[] result = new int[2];
        int index = 0;  
        for (int num : nums) {
            if (!seen.add(num)) {
                result[index++] = num;
                if (index == 2) {
                    break;
                }
            }
        }       
        return result;
    }
}