class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length,cols=matrix[0].length;
        int[][] newMat=new int[cols][rows];
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                newMat[i][j]=matrix[j][i];
            }
        }return newMat;

    }
}
