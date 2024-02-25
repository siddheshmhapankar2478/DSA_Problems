package A02_Arrays.A2_Arrays_Questions;

public class Q10RunningSum {
    public static void main(String[] args) {
        Q10RunningSum q=new Q10RunningSum();
        int[] nums={};
        System.out.println(q.runningSum(nums));
    }
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
	}
}
