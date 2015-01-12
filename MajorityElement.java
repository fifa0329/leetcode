import com.sun.tools.hat.internal.util.ArraySorter;

import java.util.HashMap;

/**
 * Created by wlx on 1/12/15.
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.

 Credits:
 Special thanks to @ts for adding this problem and creating all test cases.
 */
public class MajorityElement {


    public int majorityElement(int[] num) {


        //要我就用dic做，每有一个新的值，就add进去，然后不断判断每个值的数

//        Dictionary<Integer,Integer> dictionary=new Dictionary()<~>;
        
//        java的dic都不会写，蛋疼
        
        //其实是因为java没有dic，是用的HashMap

        int ret = 0, length = num.length;
        HashMap<Integer,Integer> elements = new HashMap<Integer,Integer>();

        for (int i = 0; i < length; i++) {
            int j = num[i];
            if (elements.get(j) == null) {
                elements.put(j, 1);
            }
            else {
                elements.put(j,elements.get(j) + 1);
            }

            if (elements.get(j) > (length / 2)) {
                ret = j;
                return j;
            }
        }
        return ret;
        
        
        
        //但是发现居然我也没有Hashmap这个类，是怎么回事那？
        //import java.util.HashMap; 智能提示不给力，不会import这个
        
        
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        
        //以下方法很神奇
        //小聪明
        //先排序，始终应该是一个思路！！！

//
//        Array.sort(num);
//        return num[num.length / 2];
        
        
    }
}
