class Solution {
    int start = 0, maxLen = 1;
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i); // Odd length
            expand(s, i, i + 1); // Even length
        }
        return s.substring(start, start + maxLen);
    }

    void expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            if (r - l + 1 > maxLen) {
                start = l;
                maxLen = r - l + 1;
            }
            l--;
            r++;
        }
    }
}

