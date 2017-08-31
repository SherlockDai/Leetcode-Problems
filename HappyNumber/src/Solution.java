import java.util.HashSet;

/**
 * Created by derekdai on 8/22/17.
 */
public class Solution {
    public boolean isHappy(int n) {
        //calculate the new number
        int newNumber = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        while (true) {
            while (n > 0) {
                newNumber = newNumber + (n % 10) * (n % 10);
                n = n / 10;
            }
            n = newNumber;
            newNumber = 0;
            if (n == 1){
                return true;
            }
            else if (set.contains(n)){
                return false;
            }
            set.add(n);
        }
    }
    public static void main(String arg[]){
        Solution sol = new Solution();
        sol.isHappy(3);
    }
}
