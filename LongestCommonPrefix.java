/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        //最长的前缀？
        // abc   abcd abcde abcdef
        //所以最长的前缀应该是abc？


//        如果这样的话
//        还算简单
//就怕 abc abcde abcdef bbb bbbd
//        并不是用通用前缀

//        先试着解题看看

        int length=1;
        String candidate=strs[0].substring(0,length-1);

        //应该求一个最小的length，否则会爆掉
        //感觉要一直for，x个n的遍历？
        //感觉不靠谱





        //看答案了 唉











//        （1）我的第一个误区，老想着比较string，其实可以比较每一个char，通过index推进即可
//        （2）我的第二个误区，担心如果以第一个为标杆，会导致其中某个string爆掉，就没有再想了
        


        if (strs.length == 0)
            return "";
        int index = 0;
        while (index < strs[0].length()) {
            char c = strs[0].charAt(index);
            for (int i = 1; i < strs.length; ++i) {
                //截止条件 要么就是第一个字符串比其中某个字符串要大
                //要么就是突然发现某个字符串不再相等
                if (index >= strs[i].length() || strs[i].charAt(index) != c) {
                    return strs[0].substring(0, index);
                }
            }
            index++;
        }
        return strs[0];
    }
}