class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        for(int i=0;i<=high;i++){
            if(nums[i]==0){
                swap(i,low,nums);
                low++;
            }
            if(nums[i]==2){
                swap(i,high,nums);
                high--;
                i--;
            }
        }
    }public static void swap(int i,int j,int[]nums){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}
