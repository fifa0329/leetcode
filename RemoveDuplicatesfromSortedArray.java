

/**
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array A = [1,1,2],
 * 
 * Your function should return length = 2, and A is now [1,2].
 * 
 * 
 * 其实 [1,1] still return [1,1]* * * 
 */

public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] A) {
		
		//不能分配一块新的数组内存是难点
		
		//疑惑 不申请新的数组，如何做到数组的length有变化那？
		
		
		//我看了答案
		
		//首先，我还是忘记了极端条件，length=0 1的时候
		
		
		//另外，答案和我的思路不一样，我的想法是可以最后利用array.copy
		//我自己获得前面唯一的数组即可
		
		
		//看了答案后发现，只需要前面对即可，对于数组从3变成 2 这个无所谓 
		//自己写一个如下：
		
		
		
		if (A.length==0)
			return 0;
		if (A.length==1)
			return 1;
		else 
		{
			int ret=1;
			int p=1;
			
			for (int i=1;i<A.length;i++)
			{
				//这里意识到不能从i=0开始遍历，因为要比较前后值，如果这样判断i和i+1
				//会导致越界
				//所以从i=1开始，判断i和i-1
				if (A[i-1]!=A[i])
				{
					ret++;
					A[p]=A[i];
					p++;
					//这里有点混沌，这种不一样的遍历方式在最后有一点混沌
					
					
					//尽量保持自己设置的另一个索引和遍历索引保持一致！！！
					
					
				}
				
				
				
				
			}
			
			return ret;
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		if (A.length == 0)
			return 0;
		else if (A.length == 1)
			return 1;
		else {
			int ret = 1;
			int p = 0;
			for (int p1 = 1; p1 < A.length; p1++) {
				if (A[p1 - 1] != A[p1]) {
					ret++;
					A[++p] = A[p1];
				}
			}
			return ret;
		}
		*/
	}
}