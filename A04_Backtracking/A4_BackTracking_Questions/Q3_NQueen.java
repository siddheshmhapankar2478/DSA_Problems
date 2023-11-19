package A04_Backtracking.A4_BackTracking_Questions;

import java.util.ArrayList;
import java.util.List;

public class Q3_NQueen {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> ans = solveNQueens(n);
        System.out.println(ans);
    }

    public static boolean canQueenBePlaced(int n, int rowIndex, int colIndex, List<StringBuilder> board) {
        for (int i = 0; i < n; i++) {
            if (board.get(rowIndex).charAt(i) == 'Q')  // No queen in the same row
                return false;
            if (board.get(i).charAt(colIndex) == 'Q')  // No queen in the same column
                return false;
        }
        int R = rowIndex;
        int C = colIndex;
        while (R >= 0 && C >= 0) {
            if (board.get(R).charAt(C) == 'Q')  // No queen in the upper left diagonal
                return false;
            R--;
            C--;
        }
        R = rowIndex;
        C = colIndex;
        while (R < n && C < n) {
            if (board.get(R).charAt(C) == 'Q') // No queen in the lower right diagonal
                return false;
            R++;
            C++;
        }
        R = rowIndex;
        C = colIndex;
        while (R >= 0 && C < n) {
            if (board.get(R).charAt(C) == 'Q') // No queen in the upper right diagonal
                return false;
            R--;
            C++;
        }
        R = rowIndex;
        C = colIndex;
        while (R < n && C >= 0) {
            if (board.get(R).charAt(C) == 'Q') // No queen in the lower left diagonal
                return false;
            R++;
            C--;
        }
        return true;
    }

    public static void recursion(int n, int rowIndex, List<StringBuilder> board, List<List<String>> ans) {
        if (rowIndex == n) {
            List<String> solution = new ArrayList<>();
            for (StringBuilder row : board) {
                solution.add(row.toString());
            }
            ans.add(solution);
            return;
        }
        for (int colIndex = 0; colIndex < n; colIndex++) {
            if (canQueenBePlaced(n, rowIndex, colIndex, board)) {
                board.get(rowIndex).setCharAt(colIndex, 'Q');
                recursion(n, rowIndex + 1, board, ans);
                board.get(rowIndex).setCharAt(colIndex, '.');
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<List<String>>();
        List<StringBuilder> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                row.append(".");
            }
            board.add(row);
        }
        int rowIndex = 0;
        recursion(n, rowIndex, board, ans);
        return ans;
    }
}
