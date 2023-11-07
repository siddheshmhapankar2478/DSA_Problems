import java.util.HashMap;
import java.util.Map;

public class Q5_Good_Pair {
    public static void main(String[] args) {
        
    }
    public int numIdenticalPairsMethod1(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
           }
        }
        return count;
    }

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;
        
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for (int count : countMap.values()) {
            goodPairs += (count * (count - 1)) / 2;
        }
        
        return goodPairs;
    }
    
    public int numIdenticalPairsMethod3(int[] nums) {
        int[] count = new int[101]; // Assuming the range of values in nums is from 1 to 100
        int goodPairs = 0;
        
        for (int num : nums) {
            count[num]++;
        }
        
        for (int c : count) {
            if (c > 1) {
                goodPairs += (c * (c - 1)) / 2;
            }
        }
        
        return goodPairs;
    }
}
