class Solution {
    public char findTheDifference(String s, String t) {
        int charSum = 0;
        // Loop through the longer string 't'
        for (int i = 0; i < t.length(); i++) {
            charSum += t.charAt(i);
        }
        // Loop through the shorter string 's'
        for (int i = 0; i < s.length(); i++) {
            charSum -= s.charAt(i);
        }
        return (char) charSum;
    }
}
