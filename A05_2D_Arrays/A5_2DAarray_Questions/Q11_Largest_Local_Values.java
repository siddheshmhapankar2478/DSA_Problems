package A05_2D_Arrays.A5_2DAarray_Questions;
public class Q11_Largest_Local_Values {
    public static void main(String[] args) {
        
    }
    public int[][] largestLocal(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][]ans=new int[m-2][n-2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=findMax(grid,i,j);
            }
        }
        return ans;
    }
    public int findMax(int[][] grid,int m,int n) {
        int max=Integer.MIN_VALUE;
        for(int i=m;i<m+3;i++){
            for(int j=n;j<n+3;j++){
                if(grid[i][j]>max)
                    max=grid[i][j];
            }
        }
        return max;

    }
}
