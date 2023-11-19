package A03_Number_System.A3_Number_System_Questions;

import java.util.ArrayList;
import java.util.List;

public class Q7_Gray_Code {
    public static void main(String[] args) {
        
    }
    public List<Integer> grayCode(int n) {
        List<String> ans=gray(n);
        List<Integer> res=new ArrayList<>();
        for(String bin:ans){
            int decimal=Integer.parseInt(bin,2);  
            res.add(decimal);
        }
        return res;
    }
    public List<String> gray(int n) {
        if(n==1){
            List<String> base= new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }
        List<String> previous= gray(n-1);
        List<String> result=new ArrayList<>();
        for(int i=0;i<previous.size();i++){
            result.add("0"+previous.get(i));
        }
        for(int i=previous.size()-1;i>=0;i--){
            result.add("1"+previous.get(i));
        }
        return result;
    }
}
