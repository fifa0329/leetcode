/**
 * Given two binary trees, write a function to check if they are equal or not.
 * <p/>
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
//        (1)结构要一致
//        （2）值要一致

//        感觉应该要学习遍历方式，然后按照一定的遍历进行比值，但是我确实忘记怎么遍历？
//        non-recursive method
//        public boolean isSameTree(TreeNode p, TreeNode q) {
//            Stack<TreeNode> stack_p = new Stack <> ();
//            Stack<TreeNode> stack_q = new Stack <> ();
//            if (p != null) stack_p.push( p ) ;
//            if (q != null) stack_q.push( q ) ;
//            while (!stack_p.isEmpty() && !stack_q.isEmpty()) {
//                TreeNode pn = stack_p.pop() ;
//                TreeNode qn = stack_q.pop() ;
//                if (pn.val != qn.val) return false ;
//                if (pn.right != null) stack_p.push(pn.right) ;
//                if (qn.right != null) stack_q.push(qn.right) ;
//                if (stack_p.size() != stack_q.size()) return false ;
//                if (pn.left != null) stack_p.push(pn.left) ;
//                if (qn.left != null) stack_q.push(qn.left) ;
//                if (stack_p.size() != stack_q.size()) return false ;
//            }
//            return stack_p.size() == stack_q.size() ;
//        }


//        看答案
//        很后悔 感觉自己应该可以做出来的，其实就是简单的递归
//        归的条件是
//        if (p == null && q == null) {
//            return true;
//        } else if ((p == null && q != null) || (p != null && q == null)) {
//            return false;
//        }
//        else {
//        if (p.val == q.val) {
//
        //但是仔细想想，感觉又很奇怪，有一些郁结在里面
//        按照顺序理理思路，发现

        //递归的精髓在于，抽象的知道，它会钻进去，但是实际上，我们对于程序自己到底是如何钻的细节，并不是太清楚

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;


    }

}


//public class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p==null || q==null) {
//            return p==q;
//        } else
//            return (p.val == q.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
//    } }






















/*
        if (p == null && q == null)
            return true;
        if ((p == null && q != null) || (p != null && q == null))
            return false;
        if (p.val != q.val)
            return false;
        else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        */