class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length; // 1. Boundary: length, not length - 1

        while (low < high) {    // 2. Loop: while low < high
            int mid = low + (high - low) / 2;

            if (nums[mid] < target) {
                low = mid + 1;  // Target is to the right
            } else {
                high = mid;     // Target is here or to the left (The "Squeeze")
            }
        }

        // 3. Result: low and high meet at the insertion point
        return low; 
    }
}
