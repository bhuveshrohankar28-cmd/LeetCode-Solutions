class Solution {
    public int fib(int n) {
        int a = 0, b = 1;
        int next = n;
        for (int i = 2; i <= n; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        return next;
    }
}
