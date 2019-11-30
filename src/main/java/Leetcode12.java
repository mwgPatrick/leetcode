import java.util.Scanner;

/**
 * 整数转罗马数字
 * https://leetcode-cn.com/problems/integer-to-roman/
 * @author Mwg
 * @date 2019/10/16 20:07
 */
public class Leetcode12 {
    public String intToRoman(int num) {
        int[] intNums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String str = "";
        int index = 0;
        while (index < 13) {
            while (num >= intNums[index]) {
                str = str.concat(roman[index]);
                num -= intNums[index];
            }
            index++;
        }
        return str;
    }
}
