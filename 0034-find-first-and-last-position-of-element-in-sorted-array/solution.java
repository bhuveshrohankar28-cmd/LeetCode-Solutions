class Solution {//
    public int[] searchRange(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int start=-1,end=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                start=mid;
                high=mid-1;
            }else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        if(start==-1) return new int[]{-1,-1};
        low=0;
        high=nums.length-1;
       while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                end=mid;
                low=mid+1;
            }else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }return new int[]{start,end};
    }
}
