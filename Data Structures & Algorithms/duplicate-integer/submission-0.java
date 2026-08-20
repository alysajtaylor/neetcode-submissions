class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> prevNum = new HashMap<>();
        for(int itr = 0; itr < nums.length; itr++){
            if (prevNum.containsKey(nums[itr])){
                return true;
            }
            prevNum.put(nums[itr], itr);
        }
        return false;
    }
} // time: O(n) space: O(n)