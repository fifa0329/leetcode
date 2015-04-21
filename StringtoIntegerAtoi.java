import sun.applet.Main;

/**
 * Implement atoi to convert a string to an integer.
 * <p/>
 * Hint:
 * <p/>
 * Carefully consider all possible input cases. If you want a challenge,
 * please do not see below and ask yourself what are the possible input cases.
 * <p/>
 * Notes:
 * <p/>
 * It is intended for this problem to be specified vaguely (ie, no given
 * input specs). You are responsible to gather all the input requirements up front.
 * <p/>
 * Requirements for atoi: The function first discards as many whitespace
 * characters as necessary until the first non-whitespace character is found.
 * Then, starting from this character, takes an optional initial plus or minus
 * sign followed by as many numerical digits as possible, and interprets them as
 * a numerical value.
 * <p/>
 * The string can contain additional characters after those that form the
 * integral number, which are ignored and have no effect on the behavior of this
 * function.
 * <p/>
 * If the first sequence of non-whitespace characters in str is not a valid
 * integral number, or if no such sequence exists because either str is empty or
 * it contains only whitespace characters, no conversion is performed.
 * <p/>
 * If no valid conversion could be performed, a zero value is returned. If the
 * correct value is out of the range of representable values, INT_MAX
 * (2147483647) or INT_MIN (-2147483648) is returned.
 */

public class StringtoIntegerAtoi {


    //不得不承认 如果让我来写的话，我肯定对于一些奇葩的输入不做考虑
    //事实上，是需要考虑很多奇葩输入的，比如一些空格，一些奇怪的字符，等等
    //加上这些东西之后，问题就特别多了
    //（1）另外字符转数字是要写个枚举吗？——不需要，判断字符串的ASC码间隔关系
//    if (c >= '0' && c <= '9') {
    //      num *= 10;
    //    num += c - '0';
    //（2）另外越界怎么处理那？？？——用Long来处理，其他题目也可以用这个思路，用一个比她大一级的类型来进行计算

    //这道题我没有做！！！


    public int atoi(String str) {

//        Integer.parseInt("str");
//        有点类似但是不一样
        str = str.trim();
        int length = str.length();
        if (length == 0)
            return 0;
        int i = 0;
        boolean minus = false;
        if (str.charAt(0) == '-') {
            minus = true;
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        long MIN_VALUE = Integer.MIN_VALUE;
        long MAX_VALUE = Integer.MAX_VALUE;
        long num = 0;
        boolean finished = false;
        for (; i < length && !finished; i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                num *= 10;
                num += c - '0';
            } else {
                finished = true;
            }
            if (minus && 0 - num < MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (!minus && num > MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        return minus ? new Long(0 - num).intValue() : new Long(num).intValue();
    }


}