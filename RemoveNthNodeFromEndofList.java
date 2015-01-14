import java.awt.*;

/** 
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * 
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 */

public class RemoveNthNodeFromEndofList {
    
    
    
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current=head;
        
        while (current.next!=null)
        {
            current=head.next;
        }
        
        
        //这里出现了一个错误，这种普通的linkedlist是只能往后的，没有前向
        //我的想法是，第n个，前往前移动n-1，这里不能往前
        
        
        //如何找到n的那个位置那？
        //看了答案
        //第一眼没有看懂
        
        
        //head应该指向1
        
//        ListNode root = new ListNode(0);
//        ListNode fast = root;
//        ListNode slow = root;
//        root.next = head;
//        for (int i = 0; i < n; i++) {
//            fast = fast.next;
//        }
//        while (fast.next != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;
//        return root.next;
        
        
        //没看懂，难点在于单方向实现双方向的事情
        //非常精妙 
        //     n
        //+++++---
        //反向n
        //---+++++
        
        //此题说明了：如何单方向取反向nth

       

        int i=1;
        
        ListNode pointer=head;
        while (pointer.next!=null)
        {
            i++;
            pointer=pointer.next;
        }

        
        ListNode toDelete=head;
        for (int j=0;j<i-n;j++)
        {
            toDelete=toDelete.next;
        }
        //做了i-n-1次移位，到达了n+1的位置上
        
        
        toDelete.next=toDelete.next.next;
        

        return head;

















    }
}