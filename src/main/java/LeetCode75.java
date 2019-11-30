/**
 * LeetCode75
 * https://leetcode-cn.com/problems/sort-colors/
 * @author Mwg
 * @date 2019/11/30 17:29
 */
public class LeetCode75 {
    public static void sortColors(int[] nums) {
        if (nums == null){
            return;
        }
        int[] a = new int[3];
        for (int i = 0; i < nums.length; i++) {
            a[nums[i]]++;
        }
        int k = 0;
        for (int x = 0; x < 3; x++){
            for (int y = 0; y < a[x]; y++){
                nums[k] = x;
                k += 1;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] test = {2,0,2,1,1,0};
        sortColors(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}
