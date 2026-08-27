class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int mov = 0; mov < nums.length - 2; mov++) {
            // Skip duplicate first elements
            if(mov > 0 && nums[mov] == nums[mov - 1])
                continue;
            int start = mov + 1;
            int end = nums.length - 1;
            while(start < end) {
                int sum =nums[mov] + nums[start] + nums[end];
                if(sum == 0) {
                    ans.add(Arrays.asList(nums[mov],nums[start],nums[end]));
                    start++;
                    end--;
                    // Skip duplicates
                    while(start < end && nums[start] == nums[start - 1])
                        start++;
                    while(start < end && nums[end] == nums[end + 1])
                        end--;
                }
                else if(sum > 0) {
                    end--;
                }
                else {
                    start++;
                }
            }
        }
        return ans;
    }
}
