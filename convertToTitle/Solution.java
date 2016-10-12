package leetcode;

public class Solution {

    public static void main(String[] args) {

        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(26));
        System.out.println(convertToTitle(27));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(675));
        System.out.println(convertToTitle(676));
    }

    public static String convertToTitle(int n) {
        String result = "";
        while (n > 0) {
            char c = (char) ((n - 1) % 26 + 'A');
            result = c + result;
            n = (n - 1) / 26;
        }
        return result;
    }
}
