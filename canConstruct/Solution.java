package leetcode;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] array = magazine.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        char[] arrayR = ransomNote.toCharArray();
        for (int i = 0; i < arrayR.length; i++) {
            if (map.containsKey(arrayR[i]) && map.get(arrayR[i]) > 0) {
                map.put(arrayR[i], map.get(arrayR[i]) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
