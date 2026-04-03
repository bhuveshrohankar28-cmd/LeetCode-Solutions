class Solution {
    public int singleNonDuplicate(int[] nums) {
      int n=nums.length,mid=0; 
      int low=0,high=n-1;
       if(n==1)  return nums[0];
       if(nums[0]!=nums[1]) return nums[0];
       if(nums[n-1]!=nums[n-2]) return nums[n-1];
      while(low<=high){
        mid = low+(high-low)/2;
        if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]) return nums[mid];
        int f=mid,s=mid;
        if(nums[mid]==nums[mid-1]) f = mid-1;
        else s=mid+1;
        if(f%2==0) low=s+1;
        else high =f-1;
      }return 0;
    }
}
