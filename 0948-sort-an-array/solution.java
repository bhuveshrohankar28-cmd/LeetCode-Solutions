class Solution {
    public int[] sortArray(int[] nums) {
        int[] bucket=new int[2*50000+1];
        for(int ele:nums) bucket[ele+50000]++;
        int currentIdx=0;
        for(int i=0;i<bucket.length;i++){
            int freq=bucket[i];
            while(freq!=0){
                nums[currentIdx++]=i-50000;
                freq--;
            }
        }return nums;

    }
}
