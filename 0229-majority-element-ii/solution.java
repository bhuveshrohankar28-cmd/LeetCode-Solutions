class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int candidate1 = 0, candidate2 = 0;
        for (int ele : nums) {
            if (ele == candidate1)
                count1++;
            else if (ele == candidate2)
                count2++;
            else if (count1 == 0) {
                candidate1 = ele;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = ele;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        /*candidate1 and candidate2 are majority elements 
        but we still don't know are their count more than n/3 so we need to verify it*/
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        int n = nums.length;
        if (count1 > n / 3)
            ans.add(candidate1);
        if (count2 > n / 3)
            ans.add(candidate2);

        return ans;
    }
}
