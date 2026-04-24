class Solution {
    public int diagonalSum(int[][] mat) {
        int m=mat.length,n=mat[0].length-1;
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            sum+=mat[i][n--];
        }
        if(mat.length%2!=0) sum=sum-mat[m/2][m/2];
        return sum;
    }
}
