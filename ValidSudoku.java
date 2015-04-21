import java.util.HashMap;

/**
 * Created by wlx on 1/22/15.
 * <p/>
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * <p/>
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * <p/>
 * <p/>
 * A partially filled sudoku which is valid.
 * <p/>
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
 * <p/>
 * Show Tags
 * Have you met this question in a real interview? Yes  No
 * Discuss
 * <p/>
 * *
 */
public class ValidSudoku {


    ///因为数独的valid就是要分别判断
    //行列九宫格
    //因此我也会采用这个方法
    //不同的是，像这种唯一性的应该用Hashset！！！
    public boolean isValidSudoku(char[][] board) {
        //check each row

        for (int i = 0; i < board.length; i++) {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (map.containsKey(board[i][j])) {
                        map.put(board[i][j], 1 + map.get(board[i][j]));
                    } else {
                        map.put(board[i][j], 1);
                    }

                }

            }

            //check, in each row, if there is a duplicated number;
            for (int temp : map.values()) {
                if (temp > 1) return false;
            }
        }


        //check each column
        for (int i = 0; i < board.length; i++) {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.') {
                    if (map.containsKey(board[j][i])) {
                        map.put(board[j][i], 1 + map.get(board[j][i]));
                    } else {
                        map.put(board[j][i], 1);
                    }

                }

            }

            //check, in each column, if there is duplicated numbers;
            for (int temp : map.values()) {
                if (temp > 1) return false;
            }
        }


        //check each square
        //如何判断一个，九宫格，和对应的[][]的关系
        //是比较重要的一点，要一开始想一下的
        int s = 0;
        while (s < 9) {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 3 * (s % 3); i < 3 * (s % 3) + 3; i++) {

                for (int j = 3 * (s / 3); j < 3 * (s / 3) + 3; j++) {
                    if (board[i][j] != '.') {
                        if (map.containsKey(board[i][j])) {
                            map.put(board[i][j], 1 + map.get(board[i][j]));
                        } else {
                            map.put(board[i][j], 1);
                        }

                    }

                }


            }

            //check, in each square, if ther are duplicated numbers;
            for (int temp : map.values()) {
                if (temp > 1) return false;
            }

            s++;
        }
        return true;


    }
}

//比我的方法要简洁许多，遍历过程中的同时，往不同的hashset里面增加内容
//不需要像我的方法那样，存在重复遍历
//同时真正
//                int nArea = (3 * (i  / 3)) + (j  / 3);
//理解了第n个square和[i][j]的关系
//还用了Hashset最适合的数据结构！


//public class Solution {
//public boolean isValidSudoku(char[][] board) {
//    HashSet[] row  = new HashSet[9];
//    HashSet[] col  = new HashSet[9];
//    HashSet[] area = new HashSet[9];
//    for (int i = 0; i < 9; i++) {
//        row[i]  = new HashSet<Character>();
//        col[i]  = new HashSet<Character>();
//        area[i] = new HashSet<Character>();
//    }
//
//    for (int i = 0; i < 9; i++) { //rows
//        for (int j = 0; j < 9; j++) { //cols
//            if (board[i][j] != '.') {
//                int nArea = (3 * (i  / 3)) + (j  / 3);
//                if (row[i].contains(board[i][j]) ||
//                        col[j].contains(board[i][j]) ||
//                        area[nArea].contains(board[i][j]))
//                    return false;
//
//                row[i].add(board[i][j]);
//                col[j].add(board[i][j]);
//                area[nArea].add(board[i][j]);
//            }
//        }
//    }
//
//    return true;
//}