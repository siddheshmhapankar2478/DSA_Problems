package A02_Arrays.A2_Arrays_Questions;

public class Q1_Remove_Dupli {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        Q1_Remove_Dupli q=new Q1_Remove_Dupli();
        q.removeDuplicates2(nums);
    }
    public int removeDuplicates(int[] nums) {
        int i=0;
        if(nums.length==1||nums.length == 0)
            return nums.length;
        
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    //Method 2
    public int removeDuplicates2(int[] nums) {
        int n=nums.length,j=0;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[++j]=nums[i];
            }
        }
        return j+1;
    }

}
