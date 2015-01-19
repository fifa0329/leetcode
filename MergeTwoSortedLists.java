/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode pointer = result;


        ListNode l1pointer;
        l1pointer = l1;

        ListNode l2pointer;

        l2pointer = l2;

        if (l1 == null && l2 == null)
            return null;

        if (l1 == null && l2 != null)
            return l2;

        if (l2 == null && l1 != null)
            return l1;


        while (l1pointer != null && l2pointer != null) {
            if (l1pointer.val <= l2pointer.val) {
                pointer.next = new ListNode(l1pointer.val);
                l1pointer = l1pointer.next;
            } else {
                pointer.next = new ListNode(l2pointer.val);
                l2pointer = l2pointer.next;
            }
            pointer = pointer.next;
        }

        if (l1pointer == null)
            pointer.next = l2pointer;
        else {
            pointer.next = l1pointer;
        }


        return result.next;

        //一次过关！ OH YEAH！
        //不过 ，我的解法不好的地方就是会占用新的空间，去进行新的new node
        //可以看下面的标准答案，还是不错的
        //真正理解链表，其实就是一个个next的指针，不需要重新赋值new node的！这是在浪费空间！！！以及赋值操作的时间
        //好在，两个方法时间没有差很多


//
//
//        ListNode head = new ListNode(0);
//        ListNode cur = head;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                cur.next = l1;
//                l1 = l1.next;
//            } else {
//                cur.next = l2;
//                l2 = l2.next;
//            }
//            cur = cur.next;
//        }
//        if (l1 != null) {
//            cur.next = l1;
//        } else {
//            cur.next = l2;
//        }
//        return head.next;
    }
}