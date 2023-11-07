package A2_Questions.Week5_2DAarray;


public class Q2Spiral_MAtrix2 {
    public static int[][] generateMatrix(int n) {
        int[][]arr=new int[n][n];
        int[][]answer=spiralOrder(arr);
        return answer;
    }
    public static int[][] spiralOrder(int[][] arr) {
        int row=arr.length;
        int col=arr[0].length;
        int rowstart=0,rowend=row-1;
        int colstart=0,colend=col-1;
        int num=1;
        while(rowstart<=rowend&&colstart<=colend){
        for(int i=colstart;i<=colend;i++){
            arr[rowstart][i]=num++;
        }
        for(int i=rowstart+1;i<=rowend;i++){
            arr[i][colend]=num++;
        }
        for(int i=colend-1;i>=colstart;i--){
            if(rowstart!=rowend)
                arr[rowend][i]=num++;
        }
        for(int i=rowend-1;i>=rowstart+1;i--){
            if(colstart!=colend)
                arr[i][colstart]=num++;
        }
        rowstart++;
        colstart++;
        rowend--;
        colend--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int n=3;
        int[][] ans=generateMatrix(n);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
