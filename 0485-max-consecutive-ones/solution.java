class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,maxcount=0;
        
        for(int ele:nums){
            if(ele==1) {
            count++;
            maxcount=Math.max(maxcount,count);}
            else count=0;
        }
        return maxcount;
    }
}
