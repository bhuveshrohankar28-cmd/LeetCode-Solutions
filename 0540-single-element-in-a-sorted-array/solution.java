class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length-1;
        if(n==0) return nums[n];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n]!=nums[n-1]) return nums[n];
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]) return nums[mid];
            int first=mid,second=mid;
            if(nums[mid]==nums[mid+1])second=mid+1;
            else first=mid-1;
            if(first%2==0)low=mid+1;
        else high=mid-1;
        }
        return 0;
    }
}
