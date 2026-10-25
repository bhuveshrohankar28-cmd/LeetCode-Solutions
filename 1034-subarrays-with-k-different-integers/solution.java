class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        if(k>nums.length) return 0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            boolean[] map = new boolean[nums.length+1];
            int distinctCnt=0;
            for(int j=i;j<nums.length;j++){
                if(!map[nums[j]]){
                    map[nums[j]]=true;
                    distinctCnt++;
                }
                if(distinctCnt>k) break;
                if(distinctCnt==k) ans++;
            }            
        }return ans;
    }
}
