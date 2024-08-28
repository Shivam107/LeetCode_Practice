class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set= new HashSet<>();
        int i = 0 ;
        while(i < nums.length){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
            i++;
        }
        return false ;
    }
}