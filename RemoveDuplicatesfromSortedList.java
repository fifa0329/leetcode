/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p/>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */

public class RemoveDuplicatesfromSortedList {


    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null)
//            return null;
//        if (head.next == null)
//            return head;
//        else {
//            ListNode pointer;
//            ListNode lastDifferent;
//            pointer = head;
//            lastDifferent = head;
//
//            while (pointer != null) {
//                int temp = lastDifferent.val;
//                
//                if (temp==pointer.val)
//                {
//                    pointer=pointer.next;
//                    continue;
//                }
//
//                if (pointer.next == null)
//                    return head;
//
//                if (temp != pointer.next.val) {
//                    lastDifferent = pointer.next;
//                }
//
//                pointer = pointer.next;
//
//            }
//
//            return head;
//
//
//        }

        //Runtime Error Message:	Line 33: java.lang.NullPointerException
//		Last executed input:	{1,1,1}

        //然后我做了修改

//		if (head.next!=null)
//			pointer=pointer.next;

        //1,1,1 -> 1,1然后pointer就跳了，实际上不对，pointer应该跳到下面一个不一样的值才对


        
        //依然很混乱 看了答案，觉得自己真心笨啊！错了之后，容易陷入细节，只想改好那个例子，应该再重新审视
        
        //linkedlist 用好prev current next是最关键的！
        

        //要理解，链表需要前后值，来做删除中间一个node的操作！！！
        
        
        
        if (head == null)
            return head;
        int cur = head.val;
        ListNode p = head.next;
        ListNode prev = head;
        while (p != null) {
            if (p.val == cur) {
                prev.next = p.next;
                p = prev.next;
            } else {
                cur = p.val;
                prev = prev.next;
                p = p.next;
            }
        }
        return head;
    }
}