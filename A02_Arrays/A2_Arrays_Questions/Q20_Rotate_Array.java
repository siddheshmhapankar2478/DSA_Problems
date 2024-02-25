package A02_Arrays.A2_Arrays_Questions;
import java.util.Arrays;
public class Q20_Rotate_Array {
    public static void main(String[] args) {
        Q20_Rotate_Array q=new Q20_Rotate_Array();
        int[] nums={1,2,3,4,5,6,7};
        q.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==0||n==1)
            return;
            k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int[] nums, int start,int end) {
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
