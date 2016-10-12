package leetcode;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] number = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        rotate(number, 8);
        System.out.println(Arrays.toString(number));
        number = new int[] { 1 };
        rotate(number, 0);
        System.out.println(Arrays.toString(number));
    }

    public static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] newDigit = new int[k];
        for (int i = 0; i < k; i++) {
            newDigit[i] = nums[i + nums.length - k];
        }
        for (int i = nums.length - k; i > 0; i--) {
            nums[i + k - 1] = nums[i - 1];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = newDigit[i];
        }
    }
}
