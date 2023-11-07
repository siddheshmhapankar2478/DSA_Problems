package A2_Questions.Week3_Number_System;

public class Q1_Base_7 {
    public static void main(String[] args) {
        
    }
    public String convertToBase7(int num) {
		int base=7;
		if(num==0)
			return "0";
		StringBuilder sb=new StringBuilder("");
		int n=num;
		if(num<0){
			num=num*-1;
		}
		while(num>0){
			int remainder=num%base;
			sb.insert(0,remainder);
			num=num/base;
		}
		if(n<0)
			sb.insert(0,"-");
		return sb.toString();
	}
}
