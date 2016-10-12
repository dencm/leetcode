package leetcode;

public class Solution {

    public static void main(String[] args) {

        System.out.println(getSum(100, 1));
    }

    public static int getSum(int a, int b) {

        if (b == 0) {
            return a;
        }
        int sum, carry;
        sum = a ^ b;
        carry = (a & b) << 1;
        return getSum(sum, carry);
    }
}
