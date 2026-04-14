class Solution {
    public int maximumCount(int[] nums) {
        int firstZero=lowerBound(nums,0);
        int firstPos=lowerBound(nums,1);
        int neg=firstZero,pos=nums.length-firstPos;
        return Math.max(pos,neg);
    }int lowerBound(int[] nums,int X){
        int low=0,high=nums.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<X) low=mid+1;
            else high =mid;
        }return low;
    }
}
