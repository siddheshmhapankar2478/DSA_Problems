package A1_Concept.Week3_Number_System;

public class Q2_DecimalToAnyBase {
    public static String convertFromDecimal(int number, int base) {
        if (number == 0)
            return "0";

        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % base;
            char digit = (remainder < 10) ? ((char) ('0' + remainder)) : ((char) ('A' + (remainder - 10)));
            result.insert(0, digit);
            number /= base;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int number = 100;
        int base = 7;

        String result = convertFromDecimal(number, base);
        System.out.println("Number " + number + " in base " + base + " is: " + result);
    }

}
