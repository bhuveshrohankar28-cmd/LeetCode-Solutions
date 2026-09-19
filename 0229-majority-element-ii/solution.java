class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int n = nums.length;
        int majority1 = Integer.MIN_VALUE, count1 = 0;
        int majority2 = Integer.MIN_VALUE, count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == majority1) {
                count1++;
            } else if (nums[i] == majority2) {
                count2++;
            }else if (count1 <= 0 ) {
                majority1 = nums[i];
                count1++;
            } else if (count2 <= 0) {
                majority2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == majority1)
                count1++;
            if (nums[i] == majority2)
                count2++;
        }
        if (count1 > n / 3)
            ans.add(majority1);
        if (count2 > n / 3)
            ans.add(majority2);
        return ans;
    }

}

