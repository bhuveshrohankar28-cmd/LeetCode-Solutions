class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])) return true;
            if(set.size()>k){
                set.remove(nums[j++]);
            }
        }return false;
    }
}
