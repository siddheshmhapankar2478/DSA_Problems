package A2_Questions.Week5_2DAarray;

import java.util.Arrays;

public class Q10_Diagonal_Traverse {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int[] ans=findDiagonalOrder(mat);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length, n=mat[0].length,i=0,j=0,k=0;
        int[] ans=new int[m*n];
        for(int num=0;num<(m+n);num++){
            while(i>=0&&i<m&&j>=0&&j<n){
                ans[k++]=mat[i][j];
                System.out.println(i+" "+j+" "+mat[i][j]);
                if(num%2==0){
                    i--;
                    j++;
                }
                else{
                    i++;
                    j--;
                }
            }
            if (num % 2 == 0) {
                if (j == n) {
                    i += 2;
                    j--;
                } 
                else if (i < 0) {
                    i = 0;
                }
            } 
            else {
                if (i == m) {
                    j += 2;
                    i--;
                } 
                else if (j < 0) {
                    j = 0;
                }
            }
        }
        return ans;
    }
}
