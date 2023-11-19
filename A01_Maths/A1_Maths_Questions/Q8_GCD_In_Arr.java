package A01_Maths.A1_Maths_Questions;
public class Q8_GCD_In_Arr {
    public static void main(String[] args) {
        
    }
    public int gcd(int a,int b) {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
                max=nums[i];
            if(nums[i]<min)
                min=nums[i];
        }
        return gcd(min,max);
    }
}




