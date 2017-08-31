import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by derekdai on 8/12/17.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create a new hashtable
        HashMap<Integer, Integer> indexNumber = new HashMap<Integer, Integer>();
        //start insert keys and values into the hashtable
        for(int index = 0; index < nums.length; index++){
            indexNumber.put(nums[index], index);
        }
        //start searching for solution
        int complement;
        for(int index = 0; index <= nums.length; index++) {
            complement = target - nums[index];
            if (indexNumber.get(complement) != null && indexNumber.get(complement) != index) {
                return new int[]{index, indexNumber.get(complement)};
            }
        }
        throw new IllegalArgumentException();
    }
}
