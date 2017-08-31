import java.util.HashSet;

/**
 * Created by derekdai on 8/22/17.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int index = 0; index < nums.length; index++){
            if (set.contains(nums[index])){
                return true;
            }
            set.add(nums[index]);
        }
        return false;
    }
}

