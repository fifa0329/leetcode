/**
 * Given a number represented as an array of digits, plus one to the number.
 * <p/>
 * 十进制与数组的转化* *
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {

        //第一想法是进制转换 先10再2，后发现自己进制转换上面基本功也不行

        //但是直接来又需要进位感觉特别麻烦

        //看答案了

        //发现实际上是十进制[1,2,3]==123?321?
        //123


        //奇淫巧计 字符串处理
        //感觉不靠谱

        //该题可以引申为增加任意数


        int length = digits.length;


        int add = 1;


        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + add;


            int remain = sum % 10;

            digits[i] = remain;

            //不能这么判断，应该选用能够及时脱身的方式
            /*
			if (sum/10!=0)
			{
				
				
			}
			*/

            if (sum / 10 == 0)
                return digits;


            add = sum / 10;


        }

        //说明多了一位了
        int[] newdigits = new int[length + 1];
        newdigits[0] = add;
        //混沌
        for (int i = 1; i < newdigits.length; i++) {
            newdigits[i] = digits[i - 1];
        }

        return newdigits;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		int length = digits.length;
		int add = 1;
		for (int i = length - 1; i >= 0; i--) {
			int sum = digits[i] + add;
			digits[i] = sum % 10;
			add = sum / 10;
			if (add == 0)
				return digits;
		}
		int[] ret = new int[length + 1];
		ret[0] = add;
		for (int i = 0; i < length; i++) {
			ret[i + 1] = digits[i];
		}
		return ret;
		
		*/
    }
}