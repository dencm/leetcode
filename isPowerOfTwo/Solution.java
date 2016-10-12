package leetcode;

public class Solution {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(0));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n >> 1 << 1 != n) {
                return false;
            }
            n >>= 1;
        }
        return true;
    }
}
