class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       int n=nums1.length,m=nums2.length;
       int Fpointer=0,Spointer=0;
       while(Fpointer<n&&Spointer<m){
        if(nums1[Fpointer]==nums2[Spointer]) return nums1[Fpointer];
        if(nums1[Fpointer]>nums2[Spointer]) Spointer++;
        else Fpointer++;
       }return -1;
    }
}
