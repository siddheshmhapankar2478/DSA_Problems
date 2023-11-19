package A02_Arrays.A2_Arrays_Concept;
// package A1_Concept.Week2_Arrays;

public class Q1_Second_Max {
    public static int secondLargest(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secMax=max;
                max=nums[i];
            }
            if(nums[i]>secMax&&nums[i]!=max){
                secMax=nums[i];
            }      
        }
        return secMax;
    }
    public static void main(String[] args) {
        int[] nums={8,5,9,4,10,12,7,1,4};
        int ans=secondLargest(nums);
        System.out.println("The Second largest element is "+ans);
    }
}


