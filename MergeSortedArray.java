/**
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * <p/>
 * Note:
 * <p/>
 * You may assume that A has enough space to hold additional elements from B.
 * The number of elements initialized in A and B are m and n respectively.
 */

public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {


        //第一反应是，b一个个取，然后比较应该插入到a中的某个位置，然后后面的都往后挪一位
        //感觉不靠谱


        //第一反应是从小到大


//		for解题
//		for (int i=0;i<A.length;i++)
//		{
//			int tempA=A[i];
//			int j=0;
//			int tempB=B[j];
//			if (tempA<=tempB)
//			{
//				continue;
//			}
//			else {
//				
//				A[i]=tempB;
//				j++;
//			}
//		}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//		while解题
//		这种不明确循环到哪里的题目就应该用while
//		int i=0;
//		int j=0;
//		
//		int tempA=A[i];
//		int tempB=B[j];
//		while (tempA<=tempB)
//		{
//			i++;
//			tempA=A[i];
//		}
//		A[i]=tempB;


//		思路有点乱，看答案

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//		int i=0;
//		int j=0;
//		
//		int tempA=A[i];
//		int tempB=B[j];
//		while (tempA<=tempB)
//		{
//			i++;
//			tempA=A[i];
//		}
//		A[i]=tempB;
//		一旦tempA大于tempB立刻就离开循环了

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


//		int j=0;
////		思路：要给每一位赋值
//		for (int i=0;i<m+n;i++)
//		{
//			int temp=A[i];
//			while (temp<=B[j])
//			{
//				break;
//			}
//			
//			while (B[j]<=temp&&j<n)
//			{
//				A[i]=B[j];
//				j++;
//				break;
//			}
//		}

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//		尝试倒着来
//		从大到小

//		
//		int indexA=m-1;
//		int indexB=n-1;
//		int totalIndex=m+n-1;
//		
//		while (totalIndex>=0&&indexA>=0&&indexB>=0)
//		{
//			if (A[indexA]>=B[indexB])
//				A[totalIndex--]=A[indexA--];
//			else 
//				A[totalIndex--]=B[indexB--];
//			
//		}
//		
        //脑子有点乱，很担心会算到后面把值给改写了
//		其实已经很接近正确答案了

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //此题对于我来说，也许真的是会再申请一份内存，保证不改动值，不然不放心
        //对于我，新申请一份内存会比较好


        //以上是我的思维有问题的地方
        //直接针对A进行改值，担心，B因为不进行更改，在我的思维里，不担心做处理
        //其实应该这么想
        //m+n length 长数组，如果在A中取了x个，B中取了Y个，构成了m+n后面的n
        //那这个时候A的索引位置为m-x-1;马上要开始赋值的位置为m-1
        //赋值的位置不会存在影响
        //（1）如果又取了A，那A的索引左偏，总的索引也左偏，没事
        //（2）如果取了B，那么总的索引左偏，A的索引不变（的确是可能过m-x-1，但是能够保证是一个比m-x-1大得B里面的数，把它的值给覆盖掉了）？？？
        //这个时候，总的索引下降
        //极端情况就是，接下来全取的B里面的值（我感觉原来A的值有变化了就）？？？
        //我做了一个实验，其实是不会的
        //a:1 2 3 4 11
        //b:5 6 7 8 9 10 12
        //b肯定会先用光
        //a前面保持不变即可！
        //最多能把A中剩下来的x个空位给填满，因为这个时候，B中还剩下n-y，而x+y=n


//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        int i = m - 1, j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            A[k--] = A[i] >= B[j] ? A[i--] : B[j--];
        }
        while (j >= 0) {
            A[k--] = B[j--];
        }
    }
}