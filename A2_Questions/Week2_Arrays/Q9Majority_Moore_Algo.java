package A2_Questions.Week2_Arrays;

public class Q9Majority_Moore_Algo {
    public static void main(String[] args) {
        
    }
    public int majorityElement(int[] nums) {
        int current=0,count=1;
        int majority=nums[0];
        for(int i=1;i<nums.length;i++){
            current=nums[i];
            if(current==majority)
                count++;
            else{
                count--;
                if(count==0){
                    majority=current;
                    count=1;
                }
            }
        }
        return majority;
    }
}



