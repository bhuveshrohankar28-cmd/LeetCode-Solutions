class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int moves=0;
        int median = nums[nums.length/2];
        for(int ele : nums){
            moves+=Math.abs(ele-median);
        }
        return moves;
    }
}
