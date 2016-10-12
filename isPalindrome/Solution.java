package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        System.out.println(isPalindrome(""));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        List<Character> newString = new ArrayList<Character>();
        for (Character c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                newString.add(Character.toUpperCase(c));
            }
        }

        int size = newString.size();
        for (int i = 0; i < size / 2; i++) {
            if (i < size - i - 1 && !newString.get(i).equals(newString.get(size - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
