class Solution {//again
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0, moving = 0, right = n - 1;
        while (moving <= right) {
            if (nums[moving] == 2) {
                int temp = nums[right];
                nums[right--] = nums[moving];
                nums[moving] = temp;
            } else if (nums[moving] == 1) {
                moving++;
            } else {
                int temp = nums[left];
                nums[left++] = nums[moving];
                nums[moving++] = temp;
            }
        }
    }
}
