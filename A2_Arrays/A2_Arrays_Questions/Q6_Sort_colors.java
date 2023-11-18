package A0_Questions.A2_Arrays_Questions;

public class Q6_Sort_colors {
    public static void main(String[] args) {
        
    }
    public int[] sortColors(int[] nums) {
        int zeroes=0,ones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zeroes++;
            if(nums[i]==1)
                ones++;
        }
        int i=0;
        while(i!=zeroes)
            nums[i++]=0;
        while(i!=zeroes+ones)
            nums[i++]=1;
        while(i!=nums.length)
            nums[i++]=2;
        return nums;
    }
}





