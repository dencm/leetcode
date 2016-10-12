package leetcode;

public class Solution {

    public static void main(String[] args) {

        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String s) {

        char[] array = s.toCharArray();
        StringBuilder concatTestSbu = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            concatTestSbu.append(array[i]);
        }
        return concatTestSbu.toString();
    }
}
