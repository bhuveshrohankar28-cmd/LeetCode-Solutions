class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int current = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==current) count++;
            else count--;
            if(count<0){
                count=0;
                current = nums[i];
            }
        }
        return current;
    }
}
