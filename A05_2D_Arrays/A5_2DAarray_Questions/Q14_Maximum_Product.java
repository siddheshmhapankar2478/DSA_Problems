package A05_2D_Arrays.A5_2DAarray_Questions;

public class Q14_Maximum_Product {
    public static int maxProduct(int[] nums) {
        int n=nums.length,max=0;
        if(n==1)
            return nums[0];
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++){
                product*=nums[j];
                max=Math.max(max,product);
            }
        }
        return max;
    }
    public static int maxProduct1(int[] nums) {
        int n=nums.length,max=Integer.MIN_VALUE;
        if(n==1)
            return nums[0];
            int product=1;
            for(int i=0;i<n;i++){
                product*=nums[i];
                if(nums[i]<0){
                    max=Math.max(max,nums[i]);
                }
            }
        int ans=product/max;
        return Math.max(ans,product);
    }
    public static void main(String[] args) {
        int[] nums={2,3,-2,4};
        // maxProduct(nums);
        int ans=maxProduct1(nums);
        System.out.println(ans);
    }
}
