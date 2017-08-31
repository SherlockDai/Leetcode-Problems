public class Solution {
    public int singleNumber(int[] nums) {
        for(int index = 1; index < nums.length; index++){
            nums[0] ^= nums[index];
        }
        return nums[0];
    }
}