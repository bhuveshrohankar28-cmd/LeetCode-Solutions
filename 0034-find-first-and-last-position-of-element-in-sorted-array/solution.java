class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] temp = new int[2];
        int first = -1, last = -1, low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        temp[0] = first;
        temp[1] = last;
        return temp;
    }
}
