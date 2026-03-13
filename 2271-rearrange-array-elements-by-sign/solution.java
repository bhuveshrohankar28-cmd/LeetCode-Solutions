class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] Temp=new int[n];
        int posIndex=0,negIndex=1;
        for(int ele:nums){
            if(ele>0){
                Temp[posIndex]=ele;
                posIndex+=2;
            }else {
              Temp[negIndex]=ele;
                negIndex+=2;}
        }
        return Temp;
    }
}
