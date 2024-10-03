package A02_Arrays.A2_Arrays_Questions;

public class Q26_Longest_Consecutive {
    public static void main(String[] args) {
        
    }    
    public boolean linearSearch(int[] nums,int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target)
                return true;
        }
        return false;
    }

    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int maxCount=0;
        for(int i=0;i<n;i++){
            int count=0;
            int target=nums[i];
            while(linearSearch(nums,target)){
                count++;
                target=target+1;
            }
            if(count>maxCount)
                maxCount=count;
        }
        return maxCount;
    }

}
