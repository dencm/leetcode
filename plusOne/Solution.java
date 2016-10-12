package leetcode;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(plusOne(new int[] { 9, 9, 9 })));
        System.out.println(Arrays.toString(plusOne(new int[] { 9 })));
        System.out.println(Arrays.toString(plusOne(new int[] { 7 })));
        System.out.println(Arrays.toString(plusOne(new int[] { 1, 7 })));
        System.out.println(Arrays.toString(plusOne(new int[] { 0 })));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length; i > 0; i--) {
            if (digits[i - 1] <= 8) {
                digits[i - 1]++;
                break;
            } else {
                digits[i - 1] = 0;
                if (i == 1) {
                    int[] newDigit = new int[digits.length + 1];
                    newDigit[0] = 1;
                    for (int j = 1; j < digits.length; j++) {
                        newDigit[j + 1] = digits[j];
                    }
                    return newDigit;
                }
            }
        }
        return digits;
    }
}
