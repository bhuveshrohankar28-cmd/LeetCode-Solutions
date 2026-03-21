class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxCount = 0;
        int left = 0; // The start of the window

        for (int right = 0; right < s.length(); right++) {
            // While the current character is a duplicate, 
            // shrink the window from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            // Add the new character and calculate window size
            set.add(s.charAt(right));
            maxCount = Math.max(maxCount, right - left + 1);
        }
        
        return maxCount;
    }
}
