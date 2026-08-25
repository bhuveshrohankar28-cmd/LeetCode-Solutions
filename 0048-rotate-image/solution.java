class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Reverse
        for(int rowN=0;rowN<matrix.length;rowN++){
            for(int start=0;start<matrix.length/2;start++){
                int end = matrix.length-start-1;
                int temp = matrix[rowN][start];
                matrix[rowN][start] = matrix[rowN][end];
                matrix[rowN][end] = temp;
            }
        }
    }
}
