class Solution {
    public int searchInsert(int[] nums, int target) {//O(N)
        int low=0,high=nums.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]< target)low=mid+1;
            else high=mid;

        }return high;
    }
}
