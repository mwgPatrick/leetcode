import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode165
 * https://leetcode-cn.com/problems/compare-version-numbers/
 * @author Mwg
 * @date 2019/12/02 19:49
 */
public class LeetCode165 {
    public static int compareVersion(String version1, String version2) {
        /*
        切割字符串中的小数点需要使用转义
         */
        String[] v11 = version1.split("\\.");
        String[] v22 = version2.split("\\.");
        List<Integer> v1 = new ArrayList<>();
        Arrays.stream(v11).forEach(v -> {
            v1.add(Integer.valueOf(v));
        });
        List<Integer> v2 = new ArrayList<>();
        Arrays.stream(v22).forEach(v -> {
            v2.add(Integer.valueOf(v));
        });
        return compV(v1, v2);
    }

    public static int compV(List<Integer> a, List<Integer> b){
        if(a.size()==0 && b.size()==0){
            return 0;
        }

        Integer c = a.size()>0?a.get(0):0;
        Integer d = b.size()>0?b.get(0):0;

        if(c>d){
            return 1;
        } else if (c<d) {
            return -1;
        } else {
            if(a.size()>0){
                a.remove(0);
            }
            if(b.size()>0){
                b.remove(0);
            }
            return compV(a,b);
        }
    }

    public static void main(String[] args) {
        String v1 = "1.0";
        String v2 = "1.";
        System.out.println(compareVersion(v1, v2));
    }
}
