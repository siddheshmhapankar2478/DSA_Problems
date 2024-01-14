package A10_Graph.A10_Graphs_Questions;

public class Q1_ISland_Perimeter {
    public static void main(String[] args) {

    }
    public int perimeter(int i, int j, int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int left = (j == 0) ? 0 : grid[i][j - 1];
        int right = (j == m - 1) ? 0 : grid[i][j + 1];
        int up = (i == 0) ? 0 : grid[i - 1][j];
        int down = (i == n - 1) ? 0 : grid[i + 1][j];
        int sum = up + down + left + right;
        return 4 - sum;
    }
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    ans += perimeter(i, j, grid);
                }
            }
        }
        return ans;
    }
}
