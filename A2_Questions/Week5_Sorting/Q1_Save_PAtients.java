package A2_Questions.Week5_Sorting;

import java.util.Arrays;

public class Q1_Save_PAtients {
    public static void main(String[] args) {
        
    }
    public boolean savePatients(int[] vaccine, int[] midichlorians) {
        // Your code goes here
        Arrays.sort(vaccine);
        Arrays.sort(midichlorians);
        for(int i=0;i<midichlorians.length;i++){
            if(vaccine[i]<midichlorians[i])
                return false;
        }
        return true;

	}
}
