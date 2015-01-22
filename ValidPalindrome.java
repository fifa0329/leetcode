/**
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * <p/>
 * For example, "A man, a plan, a canal: Panama" is a palindrome. "race a car"
 * is not a palindrome.
 * <p/>
 * Note:
 * <p/>
 * Have you consider that the string might be empty? This is a good question to
 * ask during an interview.
 * <p/>
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
import java.util.ArrayList;


public class ValidPalindrome {
    
    
    public boolean isPalindrome(String s) {
        
        //string to 只有字母的char【】
        //然后一个pointer从前往后，一个pointer从后往前，直到前面的大于等于后面的，来判断回文
        
        //判断alphanumeric我不会，因此用了原题给的实现

        
        //（1）此题做了之后，一定要记住如何取一个alphanumeric
        //（2）另外我的这个做法是比较浪费时间空间，专门做了一次alphanumeric的操作。不过对于我来说逻辑比较清晰

        char[] chars=s.toUpperCase().toCharArray();

        ArrayList<Character> list=new ArrayList<Character>();

        for (int i = 0; i < chars.length; i++)
        {
            if (isAlphabet(chars[i]) )
            {
                list.add(chars[i]);
            }
        }

        int front=0;
        int end=list.size()-1;

        while (front<=end)
        {
            if (list.get(front)!=list.get(end))
            {
                return false;
            }
            front++;
            end--;
        }

        return true;

    }

    private boolean isAlphabet(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
        
        
    
        
//        
//        
//        
//        
//        s = s.toUpperCase();
//        int i = 0, j = s.length() - 1;
//        while (i < j) {
//            if (!isAlphabet(s.charAt(i))) {
//                i++;
//            } else if (!isAlphabet(s.charAt(j))) {
//                j--;
//            } else if (s.charAt(i) != s.charAt(j)) {
//                return false;
//            } else {
//                i++;
//                j--;
//            }
//        }
//        return true;
//    }
//
//    private boolean isAlphabet(char c) {
//        return (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
//    }
}