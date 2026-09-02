class Solution {//again
    public void setZeroes(int[][] matrix) {
        int colS = matrix[0].length;
        int rowS = matrix.length;

        boolean[] rows = new boolean[rowS];
        boolean[] cols = new boolean[colS];

        for (int i = 0; i < rowS; i++) {
            for (int j = 0; j < colS; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }for(int i=0;i<rowS;i++){
            for (int j = 0; j < colS; j++){
            if(rows[i]||cols[j]) matrix[i][j]=0;
            }
        }
    }
}
