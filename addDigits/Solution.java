package leetcode;

public class Solution {

    public static void main(String[] args) {

        System.out.println(addDigits(1853));
    }

    public static int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
