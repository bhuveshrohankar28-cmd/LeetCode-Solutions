class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> set = new HashSet<Integer>();
      for(int ele:nums) set.add(ele);
      int longest = 0; 
      for(int ele:set){
        if(!set.contains(ele-1)){
            int length=1;
            while(set.contains(++ele)){length++;}
            longest=Math.max(longest,length);
        }
      }
      return longest;
    }
}
