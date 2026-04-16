class Solution {
    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();

        int degree = 0;
        int minLen = 0;

        for (int i = 0; i < nums.length; i++) {

            first.putIfAbsent(nums[i], i);

            count.put(nums[i],
                count.getOrDefault(nums[i], 0) + 1);

            int freq = count.get(nums[i]);
            int len = i - first.get(nums[i]) + 1;

            if (freq > degree) {
                degree = freq;
                minLen = len;
            }
            else if (freq == degree) {
                minLen = Math.min(minLen, len);
            }
        }

        return minLen;
    }
}
