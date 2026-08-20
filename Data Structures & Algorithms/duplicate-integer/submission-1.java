class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> prevNum = new HashSet<>();
        for(int itr = 0; itr < nums.length; itr++){
            if (prevNum.contains(nums[itr])){
                return true;
            }
            prevNum.add(nums[itr]);
        }
        return false;
    }
} // time: O(n) space: O(n)