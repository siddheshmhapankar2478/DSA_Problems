package A0_Questions.A5_2DAarray_Questions;

public class Q6_Transpose {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] trans=transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(trans[j][i]);
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
		int[][] trans=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                trans[j][i]=matrix[i][j];
            }
        }
        return matrix;
	}
}




