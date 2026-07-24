class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int evenIdx = 0, oddIdx = 1;
        for (int ele : nums) {
            if (ele > 0) {
                arr[evenIdx] = ele;
                evenIdx += 2;
            } else {
                arr[oddIdx] = ele;
                oddIdx += 2;
            }
        }
            return arr;
    }
}
