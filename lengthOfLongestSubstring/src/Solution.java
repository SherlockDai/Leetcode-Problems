import java.util.HashMap;

/**
 * Created by derekdai on 8/19/17.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lengthOfLongestSubstring = 0;
        //create hashmap
        HashMap<Character, Integer> Map = new HashMap<Character, Integer>();
        int headIndex = 0;
        int currentIndex = 0;
        for(int tailIndex = 0; tailIndex < s.length(); tailIndex++){
            if(Map.get(s.charAt(tailIndex)) != null){
                headIndex = Math.max(Map.get(s.charAt(tailIndex)), headIndex);
            }
            lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, tailIndex - headIndex + 1);
            Map.put(s.charAt(tailIndex), tailIndex+1);
        }

        return lengthOfLongestSubstring;
    }
    public static void main(String[] args){
        String s = "bpfbhmipx";
        Solution sol = new Solution();
        int answer = sol.lengthOfLongestSubstring(s);

    }
}
