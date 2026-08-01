class Solution {//again
    public int findDuplicate(int[] nums) {
       HashSet<Integer> map=new HashSet<>();
       for(int ele:nums){
        if(!map.add(ele)) return ele;
       }return 0;
    }
}
