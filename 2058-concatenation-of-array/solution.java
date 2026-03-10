class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int p=nums.length;
        int[] arr=new int[n+p];
        for(int i=0;i<n;i++) arr[i]=nums[i];
        for(int i=0;i<p;i++) arr[n++]=nums[i];
        
        return arr;
    }
}
