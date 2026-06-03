public class Solution {//again
    public int uniquePaths(int m, int n) {
        long res = 1;
        int j = 1;
        for(int i=Math.max(m,n); i <= m+n-2; i++,j++){// Instead of taking factorial, keep on multiply & divide
            res *= i; 
            res/=j;
        }   
        return (int)res;
    }
}
