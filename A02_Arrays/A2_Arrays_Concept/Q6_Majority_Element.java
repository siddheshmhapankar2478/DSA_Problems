package A02_Arrays.A2_Arrays_Concept;
public class Q6_Majority_Element {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int majority=nums[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==majority){
                count++;
            }
            else{
                count--;
                if(count==0){
                    majority=nums[i];
                    count=1;
                }
            }
        }
        return majority;
    }
    public static void main(String[] args) {
        Q6_Majority_Element q = new Q6_Majority_Element();
        System.out.println("The Majority Element is: "+q.majorityElement(new int[]{3,2,3}));
    }
}
