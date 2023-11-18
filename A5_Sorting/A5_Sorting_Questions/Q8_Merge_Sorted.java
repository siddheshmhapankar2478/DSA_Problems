package A0_Questions.A5_Sorting_Questions;

public class Q8_Merge_Sorted {
    public static void main(String[] args) {
        
    }
    public int[] mergeAlgo(int[] nums1, int[] nums2,int[] ans) {
        int i=0,j=0,k=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j])
                ans[k++]=nums1[i++];
            else
                ans[k++]=nums2[j++];
        }
        while(i<nums1.length){
            ans[k++]=nums1[i++];
        }
        while(j<nums2.length){
            ans[k++]=nums2[j++];
        }
        return ans;
    }
    public int[] merge(int[] nums1, int[] nums2) {
        // Your code goes here
        int n=nums1.length+nums2.length;
        int[] ans=new int[n];
        return mergeAlgo(nums1,nums2,ans);
    }
}
