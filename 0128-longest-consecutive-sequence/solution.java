class Solution {//again
    public int longestConsecutive(int[] nums) {
        int max = 0;
  
  Set<Integer> set = new HashSet<Integer>();
  for (int ele:nums) {
    set.add(ele);
  }
  
  for (int ele:nums) {
    if(!set.contains(ele)) continue;
    int count = 1;
    
    // look left and remove left
    int left=ele-1;
    while (set.contains(left)) {
      count++;
      set.remove(left);
      left--;
    }
    
    // look right remove right
    int right=ele+1;
    while (set.contains(right)) {
      count++;
      set.remove(right);
      right++;
    }
    
    max = Math.max(max, count);
  }
  
  return max;

    }
}
