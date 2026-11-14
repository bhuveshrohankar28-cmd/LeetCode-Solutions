class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size(), miniAns = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=i; j<n; j++) {
                sum += nums.get(j);
                if(j-i+1 >= l && j-i+1 <= r) {
                    if(sum > 0) miniAns = Math.min(miniAns, sum);
                }
                if(j-i+1 > r) break;
            }
        }
        return miniAns == Integer.MAX_VALUE ? -1 : miniAns;
    }
}
