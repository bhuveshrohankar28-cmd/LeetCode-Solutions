class Solution {//
    public int majorityElement(int[] nums) {
        int count=1,currentNum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==currentNum) count++;
            else if(count==0){
                currentNum=nums[i];
            }else count--;
        }return currentNum;
    }
}
