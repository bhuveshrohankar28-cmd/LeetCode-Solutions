class Solution {
    public int minMoves(int[] nums) {
        int max = 0,moves=0;
        for(int ele:nums){max=Math.max(max,ele);}
        for(int ele:nums){moves+=max-ele;}
        return moves;
    }
}
