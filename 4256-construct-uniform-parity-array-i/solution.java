class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        if(n<2) return true;
        boolean odd=false;
        for(int ele:nums1){
            if(Math.abs(ele)%2==1){
                odd=true;
                break;
            }
        }return odd||(n>0);
    }
}
