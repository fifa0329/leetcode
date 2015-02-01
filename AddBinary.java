import java.util.Stack;

/**
 * Given two binary strings, return their sum (also a binary string).
 * <p/>
 * For example, a = "11" b = "1" Return "100".
 */

public class AddBinary {
    public String addBinary(String a, String b) {

        //首先。是不是应该有转字符数组，然后该字符转数字的方法？
        //看了一下，不纠结，其实就是判断是不是0
        //这么说 应该可以做


        int lena=a.length();
        int lenb=b.length();
        int min=Integer.min(lena,lenb);
int max=Integer.max(lena,lenb);

        char[] charsA=a.toCharArray();
        char[] charsB=b.toCharArray();

        Stack<Character> stack=new Stack<Character>();


        int lastValue=0;
        for (int i=0;i<min;i++)
        {
            int valueA= ToNumber(charsA[min - 1 - 0]);

            int valueB= ToNumber(charsB[min - 1 - 0]);

            int total=valueA+valueB+lastValue;

            int shouldBe=total%2;

            stack.push(ToChar(shouldBe));

            lastValue=total/2;
        }

        if (lastValue==0)
        {
            //又得判断哪个是max的进行加上，太慢了，而且实际上只需要做字符串拼接即可，不管了
            for (int i=0;i<max-min;i++)
            {

            }
        }

        if (lastValue==1)
        {
            //余下的max-min进行进位操作
        }

        //感觉特别麻烦。所以看答案了

        //得出结论，
        // (1)像这种搞不清谁大谁小的 一律用while，然后根据结果来判断
        //(2)可以用stringbuilder来做字符串拼接，然后reverse，我当时想的是先如Stack Char，也行
        //(3)可以用>>1右移一位来判断进位，我的当然也可以/2
        //（4）从后往前数一般用while >=0



/*
        int i = a.length() - 1;
        int j = b.length() - 1;
        int da = 0;
        int db = 0;
        int adv = 0;
        StringBuffer result = new StringBuffer();
        while (i >= 0 && j >= 0) {
            da = a.charAt(i--) == '0' ? 0 : 1;
            db = b.charAt(j--) == '0' ? 0 : 1;
            int d = da + db + adv;
            result.append(d % 2 == 0 ? '0' : '1');
            adv = d >> 1;
        }
        if (i >= 0) {
            while (i >= 0) {
                da = a.charAt(i--) == '0' ? 0 : 1;
                int d = da + adv;
                result.append(d % 2 == 0 ? '0' : '1');
                adv = d >> 1;
            }
        } else if (j >= 0) {
            while (j >= 0) {
                db = b.charAt(j--) == '0' ? 0 : 1;
                int d = db + adv;
                result.append(d % 2 == 0 ? '0' : '1');
                adv = d >> 1;
            }
        }
        if (adv == 1) {
            result.append('1');
        }
        return result.reverse().toString();

*/
































    }


    public int ToNumber(char c)
    {
        if (c=='0')
            return 0;
        return 1;
    }

    public char ToChar(int i)
    {
        if (i==0)
            return '0';
        return '1';
    }


}