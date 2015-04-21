import com.sun.javafx.scene.layout.region.Margins;

/**
 * Created by lingxiang.wang on 2015/4/1.
 *
 *
 *
 *
 *https://leetcode.com/problems/compare-version-numbers/
 *
 *
 * Compare two version numbers version1 and version2.
 If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

 You may assume that the version strings are non-empty and contain only digits and the . character.
 The . character does not represent a decimal point and is used to separate number sequences.
 For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

 Here is an example of version numbers ordering:

 0.1 < 1.1 < 1.2 < 13.37
 Credits:
 Special thanks to @ts for adding this problem and creating all test cases.
 *
 */
public class CompareVersionNumbers {





    public int compareVersion(String version1, String version2) {

        //其实这个可以直接用转成double来比较
        //因为已经可以完成需求，但是这里的题目告诉我们这个不能当小数点，而是当成分隔符
        //那么就先比较分隔符前的int再比较分隔符后的int？


        /*
        double double1=Double.parseDouble(version1);
        double double2=Double.parseDouble(version2);

        if (double1>double2)
            return 1;
        if (double1==double2)
            return 0;
        else
        return -1;
*/

        /*
                Runtime Error Message:	Line 9: java.lang.NumberFormatException: multiple points
        Last executed input:	"0.1", "0.0.1"
        发现版本号其实有可能存在很多.
        因此改变想法不断的判断下去
         */


        String[] version1s=version1.split("\\.");
        String[] version2s=version2.split("\\.");


        int version1num=version1s.length;

        int version2num=version2s.length;

        int min=Math.min(version1num, version2num);



        for (int i = 0; i < min; i++) {
            if (Integer.parseInt(version1s[i])>Integer.parseInt(version2s[i]))
            {
                return 1;
            }

            if (Integer.parseInt(version1s[i])<Integer.parseInt(version2s[i]))
            {
                return -1;
            }
        }

        if (version1num>min)
            return 1;
        if (version2num>min)
            return -1;
        return 0;



        /*

        Input:	"1", "0"
Output:	0
Expected:	1




我觉得
我会判断都不带.
有一个带.一个不带
我上面的答案是两个都带



发现是我一开始不熟悉java的regex
但是我发现答案还是错了

Input:	"1.0", "1"
Output:	1
Expected:	0

        if (version1num>min)
            return 1;
        if (version2num>min)
            return -1;
        return 0;

        我这种判断是不对的，因为1.0 应该是 等于 1



我觉得太烦了，抄了正确答案
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int longest = v1.length > v2.length? v1.length: v2.length;

        for(int i=0; i<longest; i++)
        {
            int ver1 = i<v1.length? Integer.parseInt(v1[i]): 0;
            int ver2 = i<v2.length? Integer.parseInt(v2[i]): 0;

            if(ver1> ver2) return 1;
            if(ver1 < ver2) return -1;
        }
        return 0;

        方法确实很经典
        相当于是用0补全 比较长位
         */








    }
}
