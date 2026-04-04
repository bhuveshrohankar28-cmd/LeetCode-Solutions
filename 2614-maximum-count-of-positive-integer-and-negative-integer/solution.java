class Solution {
    public int maximumCount(int[] nums) {
        int firstNegative = lowerBound(nums,0);
        int firstPositive = lowerBound(nums,1);
        int pos = firstNegative;
        int neg = nums.length-firstPositive;
        return Math.max(pos,neg);}
    public int lowerBound(int []nums,int i){
            int low = 0,high=nums.length;
            while(low<high){
                int mid=low+(high-low)/2;
                if(nums[mid]<i) low = mid+1;
                else high=mid;
            } return low; 
    }
}
