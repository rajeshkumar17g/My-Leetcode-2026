class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows=matrix.length,cols=matrix[0].length;

        int row=0,col=cols-1;

        while(row<rows && col>=0){
            if(target==matrix[row][col]){
                return true;
            }
            else if(target<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }

        return false;
    }
}