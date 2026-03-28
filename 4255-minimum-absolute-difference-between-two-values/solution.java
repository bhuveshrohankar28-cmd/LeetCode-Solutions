class Solution {
    public int minAbsoluteDifference(int[] nums) {
         int l=-1,r=-1,ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) l=i;
            else if(nums[i]==2) r=i;

            if(l!=-1 && r!=-1) ans = Math.min(ans,Math.abs(l-r));
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
