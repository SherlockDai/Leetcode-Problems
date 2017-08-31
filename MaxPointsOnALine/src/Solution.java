import java.util.HashMap;

/**
 * Created by derekdai on 8/22/17.
 */
/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int xVal, yVal;
        for (int index = 0; index < points.length; index++){
            xVal = 1;
            yVal = 1;
            String x = "x" + points[index].x;
            String y = "y" + points[index].y;
            if (map.containsKey(x)){
                xVal = map.get(x) + 1;
            }
            if (map.containsKey(y)){
                yVal = map.get(y) + 1;
            }
            map.put(x, xVal);
            map.put(y, yVal);
        }
        Object[] values = map.values().toArray();
        int max = 0;
        for(int index = 0; index < values.length; index++){
            max = Math.max((int)values[index], max);
        }
        return max;
    }
}
class Point {
      int x;
      int y;
        Point() { x = 0; y = 0; }
      Point(int a, int b) { x = a; y = b; }
  }