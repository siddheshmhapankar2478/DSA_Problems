package A02_Arrays.A2_Arrays_Questions;

public class Q19_Check_Array_Sorted {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,4};
        Q19_Check_Array_Sorted q=new Q19_Check_Array_Sorted();
        System.out.println(q.check(nums));
    }
    public boolean check(int[] nums) {
        int count=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        return count<=1;
    }
}


