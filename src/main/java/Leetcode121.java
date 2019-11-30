/**
 * Leetcode121
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 *
 * @author Mwg
 * @date 2019/11/30 18:12
 */
public class Leetcode121 {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++){
            for (int j = i; j < prices.length; j++){
                max = Math.max(prices[j] - prices[i], max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ints = {7,1,5,3,6,4};
        System.out.println(maxProfit(ints));
    }
}
