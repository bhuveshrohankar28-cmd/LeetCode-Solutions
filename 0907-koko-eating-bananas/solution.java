class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int low = 1, high = max,ans=0;
        long sum=0;
        while (low <= high) {
            sum = 0;
            int mid = low + (high - low) / 2;
            for (int ele : arr) {
                sum += (int)Math.ceil((double)ele / mid);
            }
            if (sum <= h){
                ans = mid;
                high = mid-1;
            }else
                low = mid + 1;  
        }
        return ans;
    }
}
