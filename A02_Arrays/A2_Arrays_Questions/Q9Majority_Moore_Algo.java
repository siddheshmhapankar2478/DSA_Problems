package A02_Arrays.A2_Arrays_Questions;

public class Q9Majority_Moore_Algo {
    public static void main(String[] args) {
        Q9Majority_Moore_Algo q=new Q9Majority_Moore_Algo();
        int[] nums={3,2,3};
        System.out.println(q.majorityElement(nums));
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



