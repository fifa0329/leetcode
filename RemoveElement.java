import java.util.List;

/**
 * Given an array and a value, remove all instances of that value in place and
 * return the new length.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * 
 * 不是elem的元素一个有多少个* * *
 * 看了答案的*
 */

public class RemoveElement {
	public int removeElement(int[] A, int elem) {

	
		//list,是否contain，不contain,add,list num
		

		//我看了一遍答案，发现没有进行初始条件判断
		
		
		//知道了答案的写法
		
		
		if (A.length==0)
		{
			return 0;
			
		}
		else {
			int p=0;
			for (int i=0;i<A.length;i++)
			{
				if (A[i]!=elem)
				{
					A[p]=A[i];
					p=p+1;
				}
			}
			//这里我也曾经有错误，给出了p+1的答案
			return p;
			
			//最后
			// 这个是一个前面p个元素不为elem，后面保持不变的数组
		}
				
				
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		
		if (A.length == 0)
			return 0;
		else {
			int p = 0;
			for (int i = 0; i < A.length; i++) {
				if (A[i] != elem) {
					A[p++] = A[i];
				}
			}
			return p;
		}
		*/
	}
}