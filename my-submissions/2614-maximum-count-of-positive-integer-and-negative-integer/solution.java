class Solution {
    public int maximumCount(int[] nums) {
        int firstPositiveOrZero = lowerBound(nums, 0);
        int firstPositive = lowerBound(nums, 1);

        int neg = firstPositiveOrZero;
        int pos = nums.length - firstPositive;

        return Math.max(neg, pos);
    }

    public int lowerBound(int[] nums, int x) {
        int low = 0, high = nums.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < x)
                low = mid + 1;
            else
                high = mid;
        }

        return low;
    }
}
