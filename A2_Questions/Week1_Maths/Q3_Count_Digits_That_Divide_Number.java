public class Q3_Count_Digits_That_Divide_Number {
    public int countDigits(int num) {
        // Your code goes here
        int temp = num, count = 0;
        while (temp != 0) {
            int digit = temp % 10;
            if (num % digit == 0) {
                count++;
            }
            temp = temp / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Q3_Count_Digits_That_Divide_Number q = new Q3_Count_Digits_That_Divide_Number();
        System.out.println("The number of digits that divide the given number is: " + q.countDigits(248));
    }
}
