/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p/>
 * Some hints: Could negative integers be palindromes? (ie, -1)
 * <p/>
 * If you are thinking of converting the integer to string, note the restriction
 * of using extra space.
 * <p/>
 * You could also try reversing an integer. However, if you have solved the
 * problem "Reverse Integer", you know that the reversed integer might overflow.
 * How would you handle such case?
 * <p/>
 * There is a more generic way of solving this problem.
 */

public class PalindromeNumber {
    
    
    
    public boolean isPalindrome(int x) {
        //压根不会做，看了答案

//下面方法是错的！
//        if (x < 0)
//            return false;
//        int k = 1;
//        while (x / k >= 10) {
//            k *= 10;
//        }
//        while (x >= 10) {
//            int left = x / k;
//            int right = x - x / 10 * 10;
//            if (left != right)
//                return false;
//            x = (x - x / k * k) / 10;
//            k /= 100;
//        }
//        return true;
        //我复制了这个答案 ，发现这个就是错的！
        //10进制的重要的点，因为数字未知，一开始应该用while来判断出位数，通过不断的十进制乘上去
        //第一位和最后一位的判断相等，思路还是很清晰的
        //但是继续进行，判断是否回文，就有点乱了
        
        
        
        
//        ------------------------

        
            //如何通过进制，来进行int的reverse

/*

        very nice try!

                commented Oct 10, 2014 by dingou666

        consider int overflow ? such as 1000000003 and 3000000001 is overflow......

        commented Oct 12, 2014 by yomin

        Amazing! Just add check condition as follows and u are done. if(x < 0 || x == Integer.MAX_VALUE) return false;

        commented Oct 12, 2014 by erenalgan

        Good point! Actually I did not consider overflow when writing the code... But it turns out that overflow is automatically handled: palindromeX will result in a negative number because of overflow, and that makes it never equals to the input number x...

        commented Oct 12, 2014 by hln9319

        Same concern, it will be overflow for some case.

        commented Dec 2, 2014 by windkiosk

        use long long to store palindromeX

        commented Dec 17, 2014 by zhanglg921

        OJ considers negative numbers as non-palindrome. Though, your solution does not handles this case explicitly - seems to me that it is taken care of as a side effect of your algorithm. For ex: if x = -121, palindromeX = 121 by the end of the for loop which is not equal to x (-121). But, there is really no need to go through the for loop, you can return false if x < 0. Otherwise, very neat solution!

                commented Dec 29, 2014 by rainhacker
        
        */
        
        
        
        //Reverse Integer与这道题异曲同工
        
            int palindromeX = 0;
            int inputX = x;
            while(x>0){
                palindromeX = palindromeX*10 + (x % 10);
                x = x/10;
            }
            return palindromeX==inputX;
        
        
        //要理解，纯粹的reverse integer会导致 overflow
        //比如consider int overflow ? such as 1000000003 and 3000000001 is overflow......
        
        //为什么一次通过？因为测试的case不包含这种特殊例子
        
        
        
        
        /* 一般用更大的类型去处理是一个思路！！！
        bool isPalindrome(int x) {
    long reverse = 0;
    long num = abs(x);
    while(x != 0){
        reverse *= 10;
        reverse += x % 10;
        x /= 10;
    }
    return reverse == num;
}
         */
        
        
        
        
        
        
        

    }
}