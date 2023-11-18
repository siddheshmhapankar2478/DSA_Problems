package A4_Backtracking.A4_BackTracking_Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q5_Phone_Num {
    public static void main(String[] args) {
        String digits = "23";
        List<String> result = letterCombinations(digits);
        System.out.println(result);
    }
    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        generateCombinations(digits, 0, "", digitToLetters, combinations);
        return combinations;
    }

    public static void generateCombinations(String digits, int index, String current, Map<Character, String> digitToLetters, 
    List<String> combinations) {
        // If we've processed all digits, add the current combination to the result
        if (index == digits.length()) {
            combinations.add(current);
            return;
        }

        // Get the letters corresponding to the current digit
        char digit = digits.charAt(index);
        String digitLetters = digitToLetters.get(digit);

        // Recursively generate combinations for the next digit
        for (int i = 0; i < digitLetters.length(); i++) {
            generateCombinations(digits, index + 1, current + digitLetters.charAt(i), digitToLetters, combinations);
        }
    }
}
