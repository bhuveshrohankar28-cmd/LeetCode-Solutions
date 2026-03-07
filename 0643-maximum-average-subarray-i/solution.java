class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long fSum=Long.MIN_VALUE;
        int n=nums.length;
        long Sum=0;
        for(int i=0;i<k;i++){
             Sum+=nums[i];
            }
            int i=0;fSum=Sum;
            for(int j=k;j<n;j++){
                Sum=Sum+nums[j]-nums[i++];
             fSum=Math.max(fSum,Sum);
                
            }
         
         return (double)fSum/k;
    }
}
