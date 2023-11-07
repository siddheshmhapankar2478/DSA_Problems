package A2_Questions.Week5_2DAarray;

import java.util.Arrays;

public class Q9_Greatest_Value {
    public static void main(String[] args) {
        int[][] grid={{1,2,4},{3,4,1}};
        int sum=deleteGreatestValue(grid);
        System.out.println(sum);
    }
    public static int deleteGreatestValue(int[][] grid) {
        int sum=0;
		for (int i = 0; i < grid.length; i++){
            Arrays.sort(grid[i]);
		}
        for (int i = 0; i < grid.length; i++){
            System.out.println(Arrays.toString(grid[i]));
		}
		for (int i = 0; i<grid[0].length; i++){
            int max=Integer.MIN_VALUE;
		    for (int j = 0; j<grid.length; j++){
                int curr=grid[j][i];
                if(curr>max)
                    max=curr;
            }
            sum=sum+max;
		}
		return sum;

	}
}
