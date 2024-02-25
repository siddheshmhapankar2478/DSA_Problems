package A02_Arrays.A2_Arrays_Questions;
import java.util.Arrays;

public class Q6_Sort_colors {
    public static void main(String[] args) {
        int[]nums={0,2,1,0,1,2,0,2,2,1,0};
        Q6_Sort_colors q=new Q6_Sort_colors();
        q.sortColors2(nums);
        System.out.println(Arrays.toString(nums));
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
    public void swap(int[] nums,int i,int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors2(int[] nums) {
        int n=nums.length;
        int mid=0,low=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
}





