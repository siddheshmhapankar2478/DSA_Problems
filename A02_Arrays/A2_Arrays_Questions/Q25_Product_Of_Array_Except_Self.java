package A02_Arrays.A2_Arrays_Questions;

import java.util.Arrays;
public class Q25_Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        Q25_Product_Of_Array_Except_Self q=new Q25_Product_Of_Array_Except_Self();
        int[] nums={1,2,3,4};
        int[] ans=q.productExceptSelf2(nums);
        System.out.println(Arrays.toString(ans));
    }
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] right=new int[n];
        int[] left=new int[n];
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i];
        }
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i];
        }
        nums[0]=right[1];
        nums[n-1]=left[n-2];
        for(int i=1;i<n-1;i++){
            nums[i]=right[i+1]*left[i-1];
        }
        return nums;
    }
    public int[] productExceptSelf2(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i];
        }
        int rightProduct=nums[n-1];
        nums[n-1]=left[n-2];
        for(int i=n-2;i>0;i--){
            int temp=nums[i];
            nums[i]=left[i-1]*rightProduct;
            rightProduct=rightProduct*temp;
        }
        nums[0]=rightProduct;
        return nums;
    }

}
