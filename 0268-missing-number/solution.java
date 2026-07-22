class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totalSum=n*(n+1)/2;
        int actSum = 0;
        for(int ele:nums) actSum +=ele;
        return totalSum-actSum;
    }
}
