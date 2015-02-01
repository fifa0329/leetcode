/**
 * Given a roman numeral, convert it to an integer.
 * <p/>
 * Input is guaranteed to be within the range from 1 to 3999.
 */

public class RomantoInteger {
    public int romanToInt(String s) {


        //首先我就不太理解罗马数字
        //http://wywu.pixnet.net/blog/post/23023232-1~1000-%E7%9A%84%E7%BE%85%E9%A6%AC%E6%95%B8%E5%AD%97%E5%B0%8D%E7%85%A7%E8%A1%A8
        //才有所了解
        //getDigit这个方法我认为我是可以用到的，这个只是我知识层面上的缺失
        //从左到右应该是依次变小的，直到遇到一个大的，说明是要减去的部分


        /*
        char[] chars=s.toCharArray();
        int jian=0;
        int jia=0;



        int lastDigit=0;
        for (int i = 0; i < chars.length; i++) {

            int thisDigit=getDigit(chars[i]);
            if (i>=1&&lastDigit<thisDigit)
            {
                jian=-jia;
                jia=0;
            }


            jia+=thisDigit;

            lastDigit=thisDigit;






        }

        return jia+jian;

事实证明 我对罗马数字不了解，其实看答案 应该是从最后一位开始取
错在1996
MCMXCVI


事实
是不是所有的数字都是应该从右往左取那？？？？？？？？？？？？？？？？




（1）所有数字的判断都是应该从最后往前取，一般是length-1到0
（2）罗马数字很有趣 1996是 MCMXCVI 而不是 IVMM，不过即如此，我的方法对吗？
（3）的确不是我想的那样，并不是中间有一个max
*/


        int result = 0;
        if (s.length() != 0) {
            int prev = getDigit(s.charAt(s.length() - 1));
            result += prev;
            for (int i = s.length() - 2; i >= 0; i--) {
                int d = getDigit(s.charAt(i));
                if (d < prev) {
                    result -= d;
                } else if (d >= prev) {
                    result += d;
                }
                prev = d;
            }
        }
        return result;
    }

    private int getDigit(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}