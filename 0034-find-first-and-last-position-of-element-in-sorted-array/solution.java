class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int first=-1,second=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        if(first==-1) return new int[]{-1,-1};
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                second=mid;
                low=mid+1;
            }else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
    }return new int[]{first,second};
}
}
