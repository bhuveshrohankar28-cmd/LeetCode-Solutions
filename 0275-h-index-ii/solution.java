class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0, high = n - 1;
        int h =0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (n - mid <= citations[mid]) {
                high = mid-1;
                h = n - mid;
            } else
                low = mid+1 ;
        }
        return h;
    }
}
