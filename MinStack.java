import java.util.*;

/**
 * Created by wlx on 1/21/15.
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p/>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.*
 * <p/>
 * <p/>
 * <p/>
 * 关键句！！！
 * retrieving the minimum element in constant time.
 * retrieving the minimum element in constant time.
 * retrieving the minimum element in constant time.
 * retrieving the minimum element in constant time.
 * retrieving the minimum element in constant time.
 */
public class MinStack {


//    private ArrayList<Integer> list=new ArrayList<Integer>();
//
//
//    public void push(int x) {
//        list.add(x);
//    }
//
//    public void pop() {
//
//        if (list.size()==0)
//            return;
//        int last=list.size()-1;
//        list.remove(last);
//    }
//
//    public int top() {
//
//        if (list.size()==0)
//        {
//            return 0;
//        }
//
//
//        return list.get(list.size()-1);
//    }
//
//    public int getMin()
//    {
//
//        ArrayList<Integer> clone = new ArrayList<Integer>(list);
//
//
//        Collections.sort(clone);
//
//        return clone.get(0);
//    }

//
//    Submission Result: Time Limit ExceededMore Details
//
//    Last executed input:	push(-10000),push(-9999),push(-9998),push(-9997),push(-9996),push(-9995),push(-9994),push(-9993),push(-9992),push(v-
//    


    //以下是标准答案，
    //这道题的核心应该在MIN STACK
    //没有理解题目的意思


    //题目让你push 最小值，pop最小值，top最小值

    //采取了这种答案，一开始没有理解题意


//    Min Stack My Submissions Question Solution
//    Hints:
//    Consider space-time tradeoff. How would you keep track of the minimums using extra space?
//    Make sure to consider duplicate elements.
//    O(n) runtime, O(n) space – Extra stack:
//
//    Use an extra stack to keep track of the current minimum value. During the push operation we choose the new element or the current minimum, whichever that is smaller to push onto the min stack.
//
//    O(n) runtime, O(n) space – Minor space optimization:
//
//    If a new element is larger than the current minimum, we do not need to push it on to the min stack. When we perform the pop operation, check if the popped element is the same as the current minimum. If it is, pop it off the min stack too.
//

    private Stack<Integer> mStack = new Stack<Integer>();
    private Stack<Integer> mMinStack = new Stack<Integer>();

    public void push(int x) {
        mStack.push(x);
        if (mMinStack.size() != 0) {
            int min = mMinStack.peek();
            if (x <= min) {
                mMinStack.push(x);
            }
        } else {
            mMinStack.push(x);
        }
    }

    public void pop() {
        int x = mStack.pop();
        if (mMinStack.size() != 0) {
            if (x == mMinStack.peek()) {
                mMinStack.pop();
            }
        }
    }

    public int top() {
        return mStack.peek();
    }

    public int getMin() {
        return mMinStack.peek();
    }
}
