/**
 * Created by wlx on 1/19/15.
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.


 For example, the following two linked lists:

 A:          a1 → a2
 ↘
 c1 → c2 → c3
 ↗
 B:     b1 → b2 → b3
 begin to intersect at node c1.


 Notes:

 If the two linked lists have no intersection at all, return null.
 The linked lists must retain their original structure after the function returns.
 You may assume there are no cycles anywhere in the entire linked structure.
 Your code should preferably run in O(n) time and use only O(1) memory.* *
 */

import java.util.HashSet;

public class IntersectionofTwoLinkedLists {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //我认为，应该从后往前考虑
        //从前往后想，变化太多了
        //但是，比较坑爹的一点是这是单向链表，怎么办？ c3 c2 c1 直到最后一个变化的
        //我想到了以前数组的求倒序第nth的方法，感觉也不靠谱

//看了答案
        //这种唯一性的东西，应该想到set这个数据结构


        HashSet<ListNode> set = new HashSet<ListNode>();
        while (headA != null || headB != null) {
            if (headA != null) {
                if (set.contains(headA)) {
                    return headA;
                } else {
                    set.add(headA);
                }
                headA = headA.next;
            }

            if (headB != null) {
                if (set.contains(headB)) {
                    return headB;
                } else {
                    set.add(headB);
                }
                headB = headB.next;
            }
        }
        return null;


    }


}
