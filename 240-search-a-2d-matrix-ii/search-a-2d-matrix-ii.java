class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int row=0,col=matrix[0].length-1;

        while(row<m && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;

    }
}