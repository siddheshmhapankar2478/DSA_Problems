package A03_Binary_Search.A3_Binary_Search_Questions;

public class Q1_Peak_Ele {
    public static void main(String[] args) {
        
    }
	public int findPeakElement(int[] nums) {
		if(nums.length==1)
			return 0;
		if(nums.length==2){
				if(nums[1]>nums[0])
					return 1;
				return 0;
		}
		if(nums.length>=2&&nums[0]>nums[1])
				return 0;
		if(nums.length>=2&&nums[nums.length-1]>nums[nums.length-2])
				return nums.length-1;
		int start=0,end=nums.length-1,ans=0;
		while(start<=end){
			int mid=(start+end)/2;
			if(nums[mid]<nums[mid+1])
				start=mid+1;
			else{
				ans=mid;
				end=mid-1;
			}
		}
		return ans; 
	}
}
