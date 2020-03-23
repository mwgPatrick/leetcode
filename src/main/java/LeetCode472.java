import java.util.*;

/**
 * LeetCode472
 *
 * @author Mwg
 * @date 2020/03/21 18:22
 */
public class LeetCode472 {
    private boolean dfs(String s, Set<String> set, int depth, int index){
        if(index == s.length())
            return depth > 1;
        for(int i = index + 1; i <= s.length(); i++){
            if(set.contains(s.substring(index,i))){
                //只要有一种能够组合出来，就返回true
                if(dfs(s,set,depth + 1,i)){
                    return true;
                }
            }
        }
        return false;
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> set = new HashSet<>();
        List<String> res = new ArrayList<>();
        for(String s : words)
            set.add(s);
        for(String s : words){
            if(dfs(s,set,0,0))
                res.add(s);
        }
        return res;
    }
}
