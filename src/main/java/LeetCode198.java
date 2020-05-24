import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/house-robber/ LeetCode198
 * 与第746题的爬楼梯比较像，思路也是一样的
 * 新建一个数组res，每个位置保存能偷到的最大价值。
 * 第一个位置是nums[0]
 * 第二个位置是 Math.max(nums[0],nums[1])
 * 第三个位置开始记为i， i应该取Math.max(nums[i] + res.get(i-2),res.get(i-1))
 * 也就是偷了当前位置就只能偷隔一个，或者放弃当前位置，取前一个。
 * @author Mwg
 * @date 2020/05/24 12:54
 */
public class LeetCode198 {
  class Solution {
    public int rob(int[] nums) {
      if (nums.length == 0) {
        return 0;
      } else if (nums.length == 1) {
        return nums[0];
      } else if (nums.length == 2) {
        return Math.max(nums[0], nums[1]);
      }
      List<Integer> collect = new LinkedList<>();
      collect.add(nums[0]);
      collect.add(Math.max(nums[0], nums[1]));
      for (int j = 2; j < nums.length; j++) {
        collect.add(Math.max(nums[j] + collect.get(j - 2), collect.get(j - 1)));
      }
      System.out.println(collect);
      return Math.max(collect.get(collect.size() - 2), collect.get(collect.size() - 1));
    }
  }

  public static void main(String[] args) {
    System.out.println(new LeetCode198().new Solution().rob(new int[] {19, 8, 7, 9, 100, 1}));
  }
}
