package A05_2D_Arrays.A5_2DAarray_Questions;

public class Q3_Search_2d_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;
        while (i<matrix.length && j>=0){
            System.out.println(i+" "+j+" "+matrix[i][j] );
            if(target==matrix[i][j])
                return true;
            else if(target<matrix[i][j])  //go left
                j--;
            else  //go down
                i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        boolean ans=searchMatrix(matrix, target);
        System.out.println(ans);
    }
    
}
