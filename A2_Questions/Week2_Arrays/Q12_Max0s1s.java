package A2_Questions.Week2_Arrays;

public class Q12_Max0s1s {
    public static void main(String[] args) {
        
    }
    public int getMaxDifference(String s) {
        int count=0,max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='0')
				count++;
			if(s.charAt(i)=='1')
				count--;
			if(count>max)
				max=count;
			if(count<0)
				count=0;
        }
			return max;	
    }
}
