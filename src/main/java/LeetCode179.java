import java.util.Arrays;

/**
 * LeetCode179
 * https://leetcode-cn.com/problems/largest-number/comments/
 * @author Mwg
 * @date 2019/12/02 21:10
 */
public class LeetCode179 {
    public String largestNumber(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .map(i -> i.toString())
                .sorted((s1, s2)->{
                    String sum1 = s1 + s2;
                    String sum2 = s2 + s1;

                    for(int i = 0; i < sum1.length(); i++){
                        if(sum1.charAt(i) != sum2.charAt(i)){
                            return sum2.charAt(i) - sum1.charAt(i);
                        }
                    }
                    return 0;
                })
                .reduce(String::concat)
                .filter(s->!s.startsWith("0"))
                .orElse("0");
    }
}
