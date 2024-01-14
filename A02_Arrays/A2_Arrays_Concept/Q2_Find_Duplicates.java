package A02_Arrays.A2_Arrays_Concept;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Q2_Find_Duplicates{
    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : nums) {
            if (frequencyMap.containsKey(num)) {
                duplicates.add(num);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2, 4, 6, 7, 8, 5};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Duplicate Elements: " + duplicates);
    }

}