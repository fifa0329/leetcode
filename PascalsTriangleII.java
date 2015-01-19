/**
 * Given an index k, return the kth row of the Pascal's triangle.
 *
 * For example, given k = 3, Return [1,3,3,1].
 *
 * Note:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 */

import java.util.ArrayList;

public class PascalsTriangleII {
    public ArrayList<Integer> getRow(int rowIndex) {


//		Note:
//		Could you optimize your algorithm to use only O(k) extra space?
//		没有明白这个是什么意思
// 

        //第一反应时recursion,不过这个显然会造成很多内存的浪费，提交了答案后，确实也发现了这一点

        ArrayList<Integer> list = new ArrayList<Integer>();

        if (rowIndex == 0) {
            list.add(1);
            return list;
        }
        if (rowIndex == 1) {

            list.add(1);
            list.add(1);
            return list;
        } else {

            list.add(1);
            for (int i = 1; i < rowIndex; i++) {
                list.add(getRow(rowIndex - 1).get(i) + getRow(rowIndex - 1).get(i - 1));
            }
            list.add(1);


            return list;
        }
        //当我提交后
//
//		Status: Time Limit Exceeded
//		Submitted: 0 minutes ago
//		Last executed input:	9


        //于是我提交了参考答案

        //应该是使用iterative的方法来解决
        //说实话 我没有看懂这个解法
//		
//		ArrayList<Integer> ret = new ArrayList<Integer>();
//		int[] tmp = new int[rowIndex + 1];
//		for (int i = 0; i <= rowIndex; i++) {
//			ret.add(1);
//			tmp[i] = 1;
//		}
//		for (int k = 2; k <= rowIndex; k++) {
//			int mid = k / 2;
//			for (int i = 1; i <= mid; i++) {
//				ret.set(i, tmp[i - 1] + tmp[i]);
//			}
//			for (int m = k; m > mid; m--) {
//				ret.set(m, ret.get(k - m));
//			}
//			for (int n = 0; n <= k; n++) {
//				tmp[n] = ret.get(n);
//			}
//		}
//		return ret;


        //倾向于使用这个方法解题
//		https://oj.leetcode.com/discuss/9411/here-is-my-o-n-solution-and-the-proof


    }
}
