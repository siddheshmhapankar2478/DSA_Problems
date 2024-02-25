package A02_Arrays.A2_Arrays_Questions;

public class Q22_Max_Consecutive_Ones {
    public static void main(String[] args) {
        Q22_Max_Consecutive_Ones q=new Q22_Max_Consecutive_Ones();
        int[] nums={1,1,0,1,1,1};
        System.out.println(q.findMaxConsecutiveOnes(nums));
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        for(int num:nums){
            if(num!=0)
                count++;
            else
                count=0;
            if(count>max)
                max=count;
        }
        return max;
    }
}
