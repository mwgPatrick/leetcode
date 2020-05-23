import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/product-of-array-except-self/ LeetCode238
 * 两次遍历，第一次从前往后，把每个数前面的乘积保存在数组中，前面没有数字的保存1，再从后向前遍历，把每个数后面的乘积乘以前面数组对应位置的数，就得到该位置的最终结果。
 * @author Mwg
 * @date 2020/05/23 22:52
 */
public class LeetCode238 {
  class Solution {
    public int[] productExceptSelf(int[] nums) {
     int[] res = new int[nums.length];
      int left = 1, right = 1;
      if (nums.length <= 1) {
        return nums;
      }
      for (int i = 0; i < nums.length; i++) {
        if (i >= 1) {
          left *= nums[i - 1];
        }
        res[i] = left;
      }
      for (int i = nums.length - 2; i >= 0; i--) {
        right *= nums[i + 1];
        res[i] = res[i] * right;
      }
      System.out.println(Arrays.toString(res));
      return res;
    }
  }

  public static void main(String[] args) {
    new LeetCode238().new Solution().productExceptSelf(new int[] {2, 3, 4, 5});
  }
}
