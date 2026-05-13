class Solution {
    public boolean isHappy(int n) {
        int slow = getNextNumber(n);
        int fast = getNextNumber(getNextNumber(n));
        while (slow != fast) {
            if (fast == 1)
                return true;
            slow = getNextNumber(slow);
            fast = getNextNumber(getNextNumber(fast));
        }
        return slow == 1;
    }

    public int getNextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }
}
