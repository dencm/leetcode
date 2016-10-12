package leetcode;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0 && numbers[i - 1] == numbers[i]) {
                continue;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] { i + 1, j + 1 };
                } else if (numbers[i] + numbers[j] > target) {
                    break;
                }
            }
        }
        return new int[] {};
    }
}
