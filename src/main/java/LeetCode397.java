/**
 * LeetCode397
 * https://leetcode-cn.com/problems/integer-replacement/solution/java-0ms-100-shuang-o1-wei-yun-suan-by-noobhan/
 * 挺有意思的一个题，也不难，题目标记的是位运算，不过好像并没有用到
 * 在这里如果是偶数的话就很简单，直接除以二就可以了
 * 精髓就在奇数这里，要判断是需要加一操作还是减一操作。从9/11/13/15其实可以看出来，
 * 肯定有一个操作可以达到使这个数变为4的倍数，于是向4的倍数出发就可以了
 * 需要注意3是个例外，虽然它加一等于四，但是它变成2是最快的。
 * 还一个坑是2147483647,当对它加一的时候会直接超出范围
 * @author Mwg
 * @date 2019/12/04 21:47
 */
public class LeetCode397 {
    public int integerReplacement(int n) {
        if(n==1)
            return 0;
        if(n==3){
            return 2;
        }
        if(n==2147483647){
            return 32;
        }
        if(n>>1<<1==n){
//        if(n%2==0){
            return 1 + integerReplacement(n>>1);
//            return 1 + integerReplacement(n/2);
        } else{
            return (n&2)==2 ? 1 + integerReplacement(n+1) : 1 + integerReplacement(n-1);
//            return (n+1)%4==0 ? 1 + integerReplacement(n+1) : 1 + integerReplacement(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode397().integerReplacement(65535));
//        System.out.println(Math.pow(2,31));
    }
}
