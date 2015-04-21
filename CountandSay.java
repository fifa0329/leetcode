/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * <p/>
 * 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read
 * off as "one 2, then one 1" or 1211.
 * <p/>
 * Given an integer n, generate the nth sequence.
 * <p/>
 * Note: The sequence of integers will be represented as a string.
 */

public class CountandSay {
    public String countAndSay(int n) {



        //简单看了一下题目 大概理解了意思
        //就是要不断的生成下去，其实就是解析n-1的那个字符串

        //我准备写一个根据字符串解析的函数




        //现在看了答案，发现这种iteration 顺序性的，可以尝试用for 做到不断迭代
         StringBuilder s1 = new StringBuilder("1");
        StringBuilder s2 = new StringBuilder();
        for (int i = 1; i < n; i++) {
            int j = 0;
            int len = s1.length();
            while (j < len) {
                int count = 1;
                char c = s1.charAt(j);
                while (j < len - 1 && s1.charAt(j + 1) == s1.charAt(j)) {
                    count++;
                    j++;
                }
                s2.append(count + "");
                s2.append(c);
                if (j == len - 1) {
                    break;
                }
                j++;
            }
            s1 = s2;
            s2 = new StringBuilder();
        }
        return s1.toString();


    }
//
//    String parseNextString(String a)
//    {
//        String result="";
//        char[] as=a.toCharArray();
//        int length=as.length;
//
//
//        int num=0;
//        char lastChar=as[0];
//        for (int i = 0; i < length; i++) {
//            if(lastChar==as[]
//            //因为一开始看了一眼答案，所以
//            //越写越崩溃
//            //觉得出入挺大的
//
//
//        }
//
//
//
//
//
//
//
//        return result;
//    }






}