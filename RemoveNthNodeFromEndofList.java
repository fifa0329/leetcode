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
        //参考答案
//        
        //要用两个一样的长方形来理解这个东西
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



        
        //我的方法，纯数学的想法来做，出现了很多的例外case，不得不佩服测试
        
        int i=1;
        ListNode pointer=head;
        while (pointer.next!=null)
        {
            i++;
            pointer=pointer.next;
        }

        //特殊情况
        // 如果长度为1，输入合理的话必然也为1，这里思考的实际上不够严密，是在赌博参数正确
        if (i==1)
        {
            return null;
        }

        //特殊情况
        //如果取长度的n
        //会导致原本的丢失
        if(n==i)
        {
            return head.next;

        }


        ListNode toDelete=head;
        for (int j=0;j<i-n-1;j++)
        {
            toDelete=toDelete.next;
        }
        //做了i-n-1次移位，到达了n+1的位置上

        //特殊情况
        //有可能不存在一个很好的toDelete.next=toDelete.next.next;结构
        if(toDelete.next==null)
        {
            return head;
        }


        toDelete.next=toDelete.next.next;


        return head;

    }

//
//        Submission Result: Runtime ErrorMore Details
//
//        Runtime Error Message:	Line 32: java.lang.NullPointerException
//        Last executed input:	{1}, 1
//          这个没有过
        
        
        //连续改了好几次 都不对 
        //陷入了细节之中，肯定过不了了
        
        //为什么我用数学的方法会错那？？？
        //1，我没有考虑到null，像写        toDelete.next=toDelete.next.next;这种东西的时候一定要判断会不会是null
        //2，应该大概了解到头也可能被删掉，所以我们需要一个root来管理， ListNode newhead = new ListNode(0); newhead.next = head;
        //3，要用有意义的指针来告诉自己头尾， ListNode begin = newhead; ListNode end = begin;

    















    }
}