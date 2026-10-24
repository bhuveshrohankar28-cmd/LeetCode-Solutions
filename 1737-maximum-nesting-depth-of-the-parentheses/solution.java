class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int maxAns = 0;
        for (char ele : s.toCharArray()) {
            if (ele == '(') {
                ans++;
            }else if(ele==')'){
                ans--;
            }
             maxAns = Math.max(ans, maxAns);
        }
        return maxAns;
    }
}
