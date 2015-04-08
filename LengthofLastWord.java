/**
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word in the string.
 * <p/>
 * If the last word does not exist, return 0.
 * <p/>
 * Note: A word is defined as a character sequence consists of non-space
 * characters only.
 * <p/>
 * For example, Given s = "Hello World", return 5.
 */

public class LengthofLastWord {

    public int lengthOfLastWord(String s) {
        //第一次尝试
//        if (s.isEmpty()||s==null)
//            return 0;
//
//        String news=s+" ";
//        String[] every=news.split(" ");
//        String result=every[every.length-1];
//        return result.length()-1;
//
//        Submission Result: Runtime ErrorMore Details
//
//        Runtime Error Message:	Line 8: java.lang.ArrayIndexOutOfBoundsException: -1
//        Last executed input:	" "
//        确实根本不回想到这种只有“ ”的情况
//        特殊情况有很多
//        （1）        “ ”
//        （2）hello world“   ”
//        （3）hello     world


//        我发现我的思路一般只能想到最完美的情况
//        看答案

//        它的思路就是找到最后一个单词头的索引，以及尾的索引


        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        if (i < 0)
            return 0;
        int j = i;
        while (j - 1 >= 0 && s.charAt(j - 1) != ' ') {
            j--;
        }
        return i - j + 1;
    }
}