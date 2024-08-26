class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        
        if (matrix.length == 0) {
            return ans;
        }
        
        int firstRow = 0;
        int firstCol = 0;
        int lastRow = matrix.length - 1;
        int lastCol = matrix[0].length - 1;
        
        while (firstRow <= lastRow && firstCol <= lastCol) {
            
            for (int i=firstCol; i <= lastCol; i++) {
                ans.add(matrix[firstRow][i]);
            }
            firstRow++;
            
            for (int i=firstRow; i <= lastRow; i++) {
                ans.add(matrix[i][lastCol]);
            }
            lastCol--;
            
            if (firstRow <= lastRow) {
                for (int j=lastCol; j >= firstCol; j--) {
                    ans.add(matrix[lastRow][j]);
                }
            }
            lastRow--;
            
            
            if (firstCol <= lastCol) {
                for (int j=lastRow; j >= firstRow; j--) {
                    ans.add(matrix[j][firstCol]);
                }
            }
            firstCol++;
        }
        
        return ans;
    }
}