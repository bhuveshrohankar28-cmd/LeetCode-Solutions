class Solution {
    public int gcdOfOddEvenSums(int n) {
        return gcd(n*n,n*n+n);
    }public static int gcd(int a, int b) {
        if(a==0) return b;
        return gcd(b%a,a);
    }
}
