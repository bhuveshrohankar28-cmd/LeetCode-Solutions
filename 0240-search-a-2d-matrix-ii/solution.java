class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = 0, cols = matrix[0].length - 1;
        while (rows <= matrix.length-1 && cols >= 0) {
            if (matrix[rows][cols] == target)
                return true;
            if (matrix[rows][cols] > target)
                cols--;
            else
                rows++;

        }
        return false;

    }
}
