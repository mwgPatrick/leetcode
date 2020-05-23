import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * LeetCode229
 * 这个太简单了。。。
 * @author Mwg
 * @date 2020/05/23 22:20
 */
public class LeetCode229 {
  class Solution {
    public List<Integer> majorityElement(int[] nums) {
      HashMap<Integer, Integer> hashMap = new HashMap<>();
      for (int i : nums) {
        hashMap.put(i, hashMap.containsKey(i) ? hashMap.get(i) + 1 : 1);
      }
      return hashMap.entrySet().stream()
          .filter(r -> (r.getValue() > nums.length / 3))
          .map(Map.Entry::getKey)
          .collect(Collectors.toList());
    }
  }

  public static void main(String[] args) {
    //
    new LeetCode229().new Solution().majorityElement(new int[] {3, 2, 3});
  }
}
