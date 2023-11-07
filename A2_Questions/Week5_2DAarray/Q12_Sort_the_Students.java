package A2_Questions.Week5_2DAarray;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Q12_Sort_the_Students{
    public static void main(String[] args) {
        
    }
    class IntPair implements Comparable<IntPair>{
        int marks,row;
        IntPair(int marks,int row){
            this.marks=marks;
            this.row=row;
        }
        @Override
        public int compareTo(IntPair other) {
            // Compare based on the marks in descending order
            return Integer.compare(other.marks, this.marks);
        }
    }
    public int[][] sortTheStudents(int[][] score, int k) {
        PriorityQueue<IntPair> pq = new PriorityQueue<>();
        for(int i=0;i<score.length;i++){
            pq.add(new IntPair(score[i][k],i));
        }
        ArrayList<Integer> arr=new ArrayList<>();
        while(!pq.isEmpty()){
            int rowNum=pq.poll().row;
            arr.add(rowNum);
        }
        int[][] ans=new int[score.length][score[0].length];
        for(int i=0;i<ans.length;i++){
            int row=arr.get(i);
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=score[row][j];
            }
        }
        return ans;
    }
}  