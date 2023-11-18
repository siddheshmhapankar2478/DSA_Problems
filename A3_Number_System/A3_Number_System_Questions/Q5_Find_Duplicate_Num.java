package A0_Questions.A3_Number_System_Questions;

public class Q5_Find_Duplicate_Num {
    public static void main(String[] args) {
       
    }
    public int findDuplicate(int[] nums) {
        int n=nums.length,sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(nums[i]>max)
                max=nums[i];
        }
        n=max;
        int sumOfNNum=(n*(n+1))/2;
        return sum-sumOfNNum;
    }
    public int findDuplicate2(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        // Step 1: Move slow and fast pointers to find the meeting point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        // Step 2: Reset one pointer to the start of the array
        fast = nums[0];
        
        // Step 3: Move both pointers until they meet again at the entrance of the cycle
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        // Step 4: Return the duplicate number
        return slow;
    }
    
}
