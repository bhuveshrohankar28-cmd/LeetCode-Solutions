class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length,cols=matrix[0].length;
        int low=0,high=rows*cols-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int midRow=mid/cols,midCols=mid%cols;
            if(matrix[midRow][midCols]==target) return true;
            else if(matrix[midRow][midCols]<target) low=mid+1;
            else high=mid-1;
        }return false;
    }
}
