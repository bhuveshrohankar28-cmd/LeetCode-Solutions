class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int firstRow = 0, firstCol = 0;
        int lastRow = matrix.length-1, lastCol = matrix[0].length-1;
        while (lastRow >= firstRow && lastCol >= firstCol) {
            for (int i = firstCol; i <= lastCol; i++) {
                list.add(matrix[firstRow][i]);
            }
            firstRow++;
            if (firstRow > lastRow || firstCol > lastCol)
                break;
            for (int i = firstRow; i <= lastRow; i++) {
                list.add(matrix[i][lastCol]);
            }
            lastCol--;
            if (firstRow > lastRow || firstCol > lastCol)
                break;
            for (int i = lastCol; i >= firstCol; i--) {
                list.add(matrix[lastRow][i]);
            }
            lastRow--;
            if (firstRow > lastRow || firstCol > lastCol)
                break;
            for (int i = lastRow; i >= firstRow; i--) {
                list.add(matrix[i][firstCol]);
            }
            firstCol++;

        }
        return list;
    }
}
