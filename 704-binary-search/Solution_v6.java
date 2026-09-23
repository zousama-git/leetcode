class Solution {
    public int search(int[] nums, int target) {
        int low =0, high = nums.length-1;

        while (low <= high){
            int midPos = (low+high)/2;
            int middle  = nums[midPos];

            if (target == middle) return midPos;
            else if (target > middle) low = midPos + 1;
            else high = midPos - 1;
        }

        return -1;
    }
}