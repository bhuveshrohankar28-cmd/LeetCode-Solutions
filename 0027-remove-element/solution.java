class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int ele:nums){
            if(ele!=val) nums[j++]=ele;
        }return j;
    }
}
