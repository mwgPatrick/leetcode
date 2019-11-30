import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode13
 * https://leetcode-cn.com/problems/roman-to-integer/
 * @author Mwg
 * @date 2019/10/16 20:28
 */
public class Leetcode13 {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>(16);
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            result += (s.length() >= i + 2 && map.containsKey(s.substring(i, i + 2)))?map.get(s.substring(i, i + 2)):map.get(s.substring(i, i + 1));
            if (s.length() >= i + 2 && map.containsKey(s.substring(i, i + 2))){
                i = i + 1;
            }
        }
        return result;
    }
}
