package A2_Questions.Week5_2DAarray;

public class Q8_Num_Of_Rectangle {
    public static void main(String[] args) {
        int[][] rectangles={{5,8},{3,9},{5,12},{16,5}};
        int ans=countGoodRectangles(rectangles);
        System.out.println(ans);
    }
    public static int countGoodRectangles(int[][] rectangles) {
        int count=1,max=Integer.MIN_VALUE;
        for(int i=0;i<rectangles.length;i++){
            int curr=Math.min(rectangles[i][0],rectangles[i][1]);
            if(max==curr)
                count++;
            if(curr>max){
                max=curr;
                count=1;
            }
            // System.out.println(curr+" "+max+" "+count);
        }
        return count;
    }
}
