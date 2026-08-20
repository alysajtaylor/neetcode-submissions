class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi) {
            int midIdx = (lo + hi) / 2;
            int midVal = nums[midIdx];
            if (midVal > target) {
                hi = midIdx - 1;
            }
            else if (midVal < target) {
                lo = midIdx + 1;
            }
            else {
                return midIdx;
            }
        }
        return -1;
    }
}
