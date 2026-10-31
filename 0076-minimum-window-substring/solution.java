class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] required = new int[128];
        for (char c : t.toCharArray()) {
            required[c]++;
        }
        int remaining = t.length();
        int left = 0, minLen = Integer.MAX_VALUE, start = 0;
        for (int right = 0; right < s.length(); right++) {
            // If character was needed in t, reduce remaining required
            if (required[s.charAt(right)]-- > 0) {
                remaining--;
            }
            // Valid window: shrink from left to find smallest valid window
            while (remaining == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
            // If removing left char makes window invalid, restore remaining required
                if (required[s.charAt(left)]++ == 0) {
                    remaining++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
