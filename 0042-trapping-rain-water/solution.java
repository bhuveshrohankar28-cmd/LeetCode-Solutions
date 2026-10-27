public class Solution {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1, lmax = 0, rmax = Integer.MIN_VALUE, ans = 0;
        while (l < r) {
        lmax = Math.max(lmax, h[l]);
        rmax = Math.max(rmax, h[r]);
        ans += (lmax < rmax) ? lmax - h[l++] : rmax - h[r--];
        }
        return ans;
    }
}
