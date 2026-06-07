class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {//again
        HashSet<Integer> set =new HashSet<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[j++]);
            }
        }return false;
    }
}
