package A5_2D_Arrays.A5_2DAarray_Concept;

import java.util.ArrayList;
import java.util.List;

public class Q1_Spiral_Matrix {
    public static List<Integer> spiralOrder(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int rowstart = 0, rowend = row - 1;
        int colstart = 0, colend = col - 1;
        List<Integer> ans = new ArrayList<>();
        while (rowstart <= rowend && colstart <= colend) {
            for (int i = colstart; i <= colend; i++) {
                ans.add(arr[rowstart][i]);
            }
            for (int i = rowstart + 1; i <= rowend; i++) {
                ans.add(arr[i][colend]);
            }
            for (int i = colend - 1; i >= colstart; i--) {
                if (rowstart != rowend)
                    ans.add(arr[rowend][i]);
            }
            for (int i = rowend - 1; i >= rowstart + 1; i--) {
                if (colstart != colend)
                    ans.add(arr[i][colstart]);
            }
            rowstart++;
            colstart++;
            rowend--;
            colend--;
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> ans = spiralOrder(arr);
        System.out.println(ans);
    }
}
