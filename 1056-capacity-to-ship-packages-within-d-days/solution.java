class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sumWght = 0, maxwght = weights[0];
        for (int i = 0; i < weights.length; i++) {
            sumWght += weights[i];
            maxwght = Math.max(maxwght, weights[i]);
        }
        int low = maxwght, high = sumWght;
        int sum = 0, day = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            day = 1;
            sum = 0;
            for (int ele : weights) {
                if (sum + ele > mid) {
                    sum = ele;
                    day++;
                } else
                    sum += ele;
            }
            if (day <= days)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
