class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while(left < right){
            int currentTotal = numbers[left] + numbers[right];
            if(currentTotal > target) {
                right--;
            }
            else if(currentTotal < target) {
                left++;
            }
            else {
                return new int[]{left + 1 , right + 1};
            }
        }
        return null;
    }
}