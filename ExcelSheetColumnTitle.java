import java.util.Stack;


/*
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
Credits:
Special thanks to @ifanchu for adding this problem and creating all test cases.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {

    	/*
    	StringBuilder strb=new StringBuilder();
    	
    	Stack<Character> stack=new Stack<Character>();
    	
    	
    	if(n<=26)
    	{
    		return (char)('A' + n % 26-1)+"";
    	}
    	
    	//其实就是一个26进制的问题
    	//如何将10进制转换为26进制？
    	while(n/26>0)
    	{
    		stack.push((char)('A' + n % 26-1));
    		n=n/26;
    	}
    	
    	//用(char)('A' + n % 26-1)
    	//将数字与char联系起来！！！！
    	stack.push((char)('A' + n % 26-1));
  
    	int size=	stack.size();
    	while(size>0)
    	{
    		strb.append(stack.pop());
    		size--;
    	}
    	
    	
    	
    	
    	return strb.toString();
    	*/
    	
    	
    	//有错误
    	//Input:	26
    	//Output:	"A@"
    	//Expected:	"Z"
    	
    	//肯定不能直接加A的
    	
    	
    	//我的答案还是有错误
    	
    	
    	//抄了正确答案
    	
    	//如何用stringbuilder倒插！
    	
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            //这个n--非常重要，因为计算机里是用0打头
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }

        return result.toString();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
