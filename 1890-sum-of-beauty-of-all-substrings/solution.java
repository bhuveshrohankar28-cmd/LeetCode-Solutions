class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] arr = new int[26];
            for (int j = i; j < s.length(); j++) {
                arr[s.charAt(j) - 'a']++;
                int max = 0, min = Integer.MAX_VALUE;
                for (int ele : arr) {
                    if (ele > 0) {
                        max = Math.max(ele, max);
                        min = Math.min(ele, min);
                    }
                }
                sum += max - min;
            }
        }
        return sum;
    }
}

