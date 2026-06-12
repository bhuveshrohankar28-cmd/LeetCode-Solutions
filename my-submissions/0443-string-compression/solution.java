class Solution {//again
    public int compress(char[] chars) {
        int write = 0; // Where we write the result
        int i = 0;     // Start of the current group

        while (i < chars.length) {
            int j = i;
            // Find the end of the group of identical characters
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }

            // 1. Write the character
            chars[write++] = chars[i];

            // 2. If the group is larger than 1, write the count
            int count = j - i;
            if (count > 1) {
                // Convert count to string to handle multi-digit numbers (like 12)
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }

            // 3. Move i to the start of the next group
            i = j;
        }
        return write; // The new length of the compressed array
    }
}
