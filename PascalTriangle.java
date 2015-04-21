import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * <p/>
 * For example, given numRows = 5, Return
 * <p/>
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */

public class PascalTriangle {
    public List<List<Integer>> pascalTriangle(int numRows) {
        //的确和我想的不一样


        //我的想法是1的时候返回1
        //2的时候返回1 11
        //然后我知道规律 i 的上面的 i+ i-1


        //答案思路不一样
        //仔细看了一下 思路是一样的 只不过他是先用1全部填满所有值


        //然后再利用刚刚的规律去填值
        //不得不说 要比我的方法简练 通过for 来代替我的 1 2


        //这一题我没有选择自己做
        //因为思路比较清晰
        //但是复制答案的时候出现了编译上面的错误，不能转换为List

        //我将答案改成了以下，就可以过了

        List<List<Integer>> pt = new ArrayList<List<Integer>>();
        int k = 1;
        for (int i = 0; i < numRows; i++) {
            List<Integer> r = new ArrayList<Integer>();
            for (int j = 0; j < k; j++) {
                r.add(1);
            }
            k++;
            pt.add(r);
        }
        for (int f = 2; f < pt.size(); f++) {
            List<Integer> prev = pt.get(f - 1);
            List<Integer> current = pt.get(f);
            for (int g = 1; g < current.size() - 1; g++) {
                current.set(g, prev.get(g - 1) + prev.get(g));
            }
        }
        return pt;

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*

		
		ArrayList<ArrayList<Integer>> pt = new ArrayList<ArrayList<Integer>>();
		int k = 1;
		for (int i = 0; i < numRows; i++) {
			ArrayList<Integer> r = new ArrayList<Integer>();
			for (int j = 0; j < k; j++) {
				r.add(1);
			}
			k++;
			pt.add(r);
		}
		for (int f = 2; f < pt.size(); f++) {
			ArrayList<Integer> prev = pt.get(f - 1);
			ArrayList<Integer> current = pt.get(f);
			for (int g = 1; g < current.size() - 1; g++) {
				current.set(g, prev.get(g - 1) + prev.get(g));
			}
		}
		return pt;
		*/

    }
}