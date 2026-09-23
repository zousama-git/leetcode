class Solution {
    public int search(int[] nums, int target) {
        int i = 0;

        do {
            if (target == nums[i]) return i;
            i++;
        } while (i < nums.length);

        return -1;
    }
}