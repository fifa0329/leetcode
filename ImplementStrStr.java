import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 Implement strStr().

 Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 Update (2014-11-02):
 The signature of the function had been updated to return the index instead of the pointer. If you still see your function signature returns a char * or String, please click the reload button  to reset your code definition.
 */

public class ImplementStrStr {


    public int strStr(String haystack, String needle) {

        
        //下面是我自己写的答案

        int pointer=0;

        char[] haystackchars=haystack.toCharArray();
        char[] needlechars=needle.toCharArray();
        
        
        while (pointer<=haystackchars.length-needlechars.length)
        {
            int i=0;
            for (i = 0; i < needlechars.length; i++)
            {
                if (haystackchars[pointer+i]!=needlechars[i])
                {
                    pointer++;
                    break;
                }
            }
            if (i==needlechars.length)
            {
                return pointer;
            }
        }
        

        return -1;
        
        //同时我解锁了
        //O(nm) runtime, O(1) space – Brute force:

//        You could demonstrate to your interviewer that this problem can be solved using known efficient algorithms such as Rabin-Karp algorithm, KMP algorithm, and the Boyer- Moore algorithm. Since these algorithms are usually studied in an advanced algorithms class, it is sufficient to solve it using the most direct method in an interview – The brute force method.
//
//        The brute force method is straightforward to implement. We scan the needle with the haystack from its first position and start matching all subsequent letters one by one. If one of the letters does not match, we start over again with the next position in the haystack.
//
//        The key is to implement the solution cleanly without dealing with each edge case separately.
//
//                Cancel rating12345
//        Average Rating: 3.7 (113 votes)
//
//        Is this solution helpful? Read our book to learn more.







        


//        没怎么看标准答案是怎么写的
//        int i = 0;
//        int len1 = haystack.length();
//        int len2 = needle.length();
//        if (len1 == 0 && len2 == 0)
//            return "";
//        for (; i < len1; i++) {
//            int a = i;
//            int b = 0;
//            boolean match = true;
//            while (b < len2) {
//                if (a >= len1 || haystack.charAt(a) != needle.charAt(b)) {
//                    match = false;
//                    break;
//                } else {
//                    a++;
//                    b++;
//                }
//            }
//            if (match)
//                return haystack.substring(i);
//        }
//        return null;
    }
}