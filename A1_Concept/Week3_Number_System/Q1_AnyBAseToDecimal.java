package A1_Concept.Week3_Number_System;

public class Q1_AnyBAseToDecimal {
    public static int convertToDecimal(String number, int base) {
        int decimalValue = 0;
        int power = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            char digit = number.charAt(i);
            int digitValue = (Character.isDigit(digit)) ? (digit - '0') : (Character.toUpperCase(digit) - 'A' + 10);

            decimalValue += digitValue * Math.pow(base, power);
            power++;
        }
        return decimalValue;
    }

    public static void main(String[] args) {
        String number = "100";
        int base = 2;

        int decimalValue = convertToDecimal(number, base);
        System.out.println("Decimal equivalent of " + number + " in base " + base + " is: " + decimalValue);
    }

}
