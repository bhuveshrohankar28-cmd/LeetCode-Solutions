class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length,count=0;
        int currentEle=nums[0];
        for(int ele:nums){
            if(ele==currentEle) count++;
            else count--;
            if(count<0){
             currentEle=ele;
             count=0;}
        }return currentEle;
        
    }
}
