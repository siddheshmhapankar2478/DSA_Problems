package A03_Binary_Search.A3_Binary_Search_Concept;

public class Q1_Binary_Search {
    public static int binarySearch(int start, int end, int[] nums, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 7, 9, 11, 15, 19, 25 };
        int start = 0, end = nums.length - 1, target = 19;
        binarySearch(start, end, nums, target);

    }
}
