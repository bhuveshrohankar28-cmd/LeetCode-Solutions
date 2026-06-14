class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int firstRow = 0, lastRow = m - 1;
        int firstCol = 0, lastCol = n - 1;

        while (lastRow >= firstRow &&
               lastCol >= firstCol) {
            // 1. Left to Right
            for (int i = firstCol; i <= lastCol; i++)
                ans.add(matrix[firstRow][i]);
            firstRow++;
            if (firstRow > lastRow ||firstCol > lastCol) break;
               
            // 2. Top to Bottom
            for (int i = firstRow; i <= lastRow; i++)
                ans.add(matrix[i][lastCol]);
            lastCol--;
            if (firstRow > lastRow ||firstCol > lastCol) break;
                
            // 3. Right to Left
            for (int i = lastCol; i >= firstCol; i--)
                ans.add(matrix[lastRow][i]);
            lastRow--;
            if (firstRow > lastRow ||firstCol > lastCol) break;
                
            // 4. Bottom to Top
            for (int i = lastRow; i >= firstRow; i--)
                ans.add(matrix[i][firstCol]);
            firstCol++;
        }
        return ans;
    }
}
