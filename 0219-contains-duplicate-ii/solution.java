class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet map=new HashSet<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
           if( !map.add(nums[i])) return true;
            if(map.size()>k){
                map.remove(nums[j++]);
            }
        }return false;
    }
}
