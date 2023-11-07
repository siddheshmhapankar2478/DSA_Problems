package A2_Questions.Week2_Arrays;

public class Q14_SubArrayEqualsK {
    public static void main(String[] args) {
        
    }
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum==k)
                    count++;
            }
        }
        return count;
    }
}
