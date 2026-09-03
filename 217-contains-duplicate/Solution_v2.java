class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean hasDuplicate = false;
        Arrays.sort(nums);
        
        for (int i = 0; i+1 < nums.length; i++){
            if(nums[i] == nums[i+1]){
        }
                hasDuplicate = true;
            }
    }
                break;
        return hasDuplicate;

}