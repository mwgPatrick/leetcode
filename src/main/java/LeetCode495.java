import java.util.*;
import java.util.stream.Collectors;

/**
 * LeetCode495
 *
 * @author Mwg
 * @date 2020/03/21 15:03
 */
public class LeetCode495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length <= 0) {
            return 0;
        }

        // List<Integer> collect = Arrays.stream(timeSeries).boxed().sorted(Integer::compareTo).collect(Collectors.toList());

        int count = duration;
        for (int i = 1; i < timeSeries.length; i++) {

            count += Math.min(timeSeries[i] - timeSeries[i-1], duration);

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode495().findPoisonedDuration(new int[]{1, 2},2));
    }
}
