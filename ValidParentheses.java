import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p/>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

public class ValidParentheses {
    public boolean isValid(String s) {

        //看了答案之后，才自己用for 来做了一遍
        //核心：（1）要用stack来保证成功的一对，立马消除，（2）如果最后成功，则stack应该为empty
        //特例：当只有一个的时候，要好好考虑（2），而不是像我一开始想的，直接返回了true

        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();


        stack.add(chars[0]);


        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.add('(');
                continue;
            }


            if (chars[i] == ')') {
                if (!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }


            if (chars[i] == '{') {
                stack.add('{');
                continue;
            }


            if (chars[i] == '}') {
                if (!stack.empty() && stack.peek() == '{') {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }


            if (chars[i] == '[') {
                stack.add('[');
                continue;
            }


            if (chars[i] == ']') {
                if (!stack.empty() && stack.peek() == '[') {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }
        }

//        直接return true是错的
//        return true;
//        Input:	"["
//        Output:	true
//        Expected:	false


        //改成以下后，答案就正确了
        //我还是习惯用for 的循环
        return stack.empty();


        //不太会做，
        //stack结构有经典题就是算术parse
        //那个我也没有做过，不怎么熟，真要我做，我可能就会有很多的if，然后list结构从左往右实现


        //看答案！


//        stack.add();
//        stack.push('2');


//        int len = s.length();
//        if (len == 0)
//            return true;
//        Stack<Character> st = new Stack<Character>();
//        st.add(s.charAt(0));
//        int i = 1;
//        while (i < len)
//        {
//            switch (s.charAt(i))
//            {
//                case '(':
//                    st.add('(');
//                    break;
//                case ')':
//                    if (!st.empty() && st.peek() == '(')
//                    {
//                        st.pop();
//                    }
//                    else
//                    {
//                        return false;
//                    }
//                    break;
//                case '{':
//                    st.add('{');
//                    break;
//                case '}':
//                    if (!st.empty() && st.peek() == '{')
//                    {
//                        st.pop();
//                    }
//                    else
//                    {
//                        return false;
//                    }
//                    break;
//                case '[':
//                    st.add('[');
//                    break;
//                case ']':
//                    if (!st.empty() && st.peek() == '[')
//                    {
//                        st.pop();
//                    }
//                    else
//                    {
//                        return false;
//                    }
//                    break;
//            }
//            i++;
//        }
//        return st.empty();
    }
}