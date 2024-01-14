package A05_2D_Arrays.A5_2DAarray_Questions;


public class Q5_Odd_Values {
    public static void main(String[] args) {
        int[][] indices={{0,1},{1,1}};
        int m=2,n=3;
        int ans=oddCells(m, n, indices);
        System.out.println(ans);
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<indices[0].length;j++){
                if(j==0)
                    row[indices[i][j]]++;
                else
                    col[indices[i][j]]++;
            }
        }
        int[][] arr=new int[m][n];
        for(int i=0;i<row.length;i++){
            if(row[i]!=0){
                for(int j=0;j<n;j++){
                    arr[i][j]+=row[i];
                }
            }
        }
        for(int i=0;i<col.length;i++){
            if(col[i]!=0){
                for(int j=0;j<m;j++){
                    arr[j][i]+=col[i];
                }
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]%2!=0)
                    count++;
            }
        }
        return count;
    }
}
