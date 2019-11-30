import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode14
 * https://leetcode-cn.com/problems/longest-common-prefix/
 * @author Mwg
 * @date 2019/10/16 21:13
 */
public class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        } else if(strs.length == 1){
            return strs[0];
        }

        Set<String> result = new HashSet<>();
        int i = 1;
        boolean b = true;
        String res = "";
        while (b){
            result.clear();
            boolean c = true;
            for (String s:strs) {
                if(i > s.length()){
                    c = false;
                    break;
                }
                result.add(s.substring(0, i));
            }
            b = result.size()==1 && i <= strs[0].length() && c;
            System.out.println(b);
            if(b){
                for (String s:result) {
                    res = s;
                }
            }
            i = i + 1;
        }

        return res;
    }
}
