class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] arrOne = new int[26];
        int[] arrSec = new int[26];

        int window = s1.length();
        for (int i = 0; i < window; i++) {
            arrOne[s1.charAt(i) - 'a']++;
            arrSec[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(arrOne, arrSec)) return true;

        for (int i = window; i < s2.length(); i++) {
            arrSec[s2.charAt(i - window) - 'a']--; // Remove outgoing
            arrSec[s2.charAt(i) - 'a']++; // Add incoming
            if(Arrays.equals(arrOne, arrSec)) return true;
        }
        return false;

    }
}
