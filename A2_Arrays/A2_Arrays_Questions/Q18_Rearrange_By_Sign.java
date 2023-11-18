package A0_Questions.A2_Arrays_Questions;

public class Q18_Rearrange_By_Sign {
    public static void main(String[] args) {
        
    }
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n];
        int[] neg=new int[n];
        int p=0;n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[p++]=nums[i];
            }
            else{
                neg[n++]=nums[i];
            }
        }
        p=0;
        n=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=pos[p++];
            }
            else{
                nums[i]=neg[n++];
            }
        }
        return nums;
    }
}
