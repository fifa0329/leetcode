import java.util.ArrayList;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * <p/>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * <p/>
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p/>
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */

public class ZigZagConversion {
    public String convert(String s, int nRows) {
        String[] multiLines=new String[nRows];

//        一开始我按照3行想的，这样一来就可以知道index是多少 ，对应在哪个位置上，但是这样的找规律
//        并不适合于行数不确定的情况！

//        通过数学得到了一个大概2n-2的规律 但是感觉会存在很多的if来判断
//        觉得我这个方法不好

//        看答案
//下面紧靠的是原本就有的答案
//        if (nRows <= 1 || s.length() < 2)
//            return s;
//        ArrayList<StringBuilder> sbs = new ArrayList<StringBuilder>();
//        for (int k = 0; k < nRows; k++) {
//            sbs.add(new StringBuilder());
//        }
//        int nCount = 2 * (nRows - 1);
//        for (int i = 0; i < s.length(); i++) {
//            sbs.get(nRows - 1 - Math.abs(nRows - 1 - (i % nCount))).append(
//                    s.charAt(i));
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int j = 0; j < nRows; j++) {
//            sb.append(sbs.get(j));
//        }
//        return sb.toString();

//从现在开始，我挑选算法的第一准则是简单易懂
//        这个简单的答案，简单在于，它并没有挖掘背后的数学公式情况，而只是从形状上进行考虑
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {//进行的是一轮一轮的操作

            //第一个for进行的是垂直向下从最上到最下的操作
            for (int idx = 0; idx < nRows && i < len; ) // vertically down
//            这里可以进行i++操作的前提是
//            i<len,乍一看，似乎肯定成立，因为while，但是实际上，因为for，i的值是在变化的！
//                    必须保证，append的那个字符，在字符数组里面不会越界！
                sb[idx++].append(c[i++]);
            //第二个for进行的是，从最下右上的那个斜着向上的过程
            for (int idx = nRows-2; idx >= 1 && i < len; ) // obliquely up
                sb[idx--].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }
}