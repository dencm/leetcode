package leetcode;

public class Solution {

    public static void main(String[] args) {

        System.out.println(compareVersion("1", "0"));
        System.out.println(compareVersion("0.1", "1.1"));
        System.out.println(compareVersion("1", "1.2"));
        System.out.println(compareVersion("1.2", "13"));
        System.out.println(compareVersion("13.37", "0.1"));
        System.out.println(compareVersion("0.1", "0.1"));
    }

    public static int compareVersion(String version1, String version2) {
        String[] a1 = version1.split("\\.");
        String[] a2 = version2.split("\\.");

        int maxLevel = a1.length > a2.length ? a1.length : a2.length;
        for (int i = 0; i < maxLevel; i++) {
            int v1 = a1.length > i ? Integer.parseInt(a1[i]) : 0;
            int v2 = a2.length > i ? Integer.parseInt(a2[i]) : 0;

            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }
        }
        return 0;
    }
}
