class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
    int rows=matrix.length-1;
    int cols=matrix[0].length-1;

    int r=0,c=cols;

    while(r<=rows && c>=0){
        if(target==matrix[r][c]){
            return true;
        }
        else if(target>matrix[r][c]){
            r++;
        }
        else{
            c--;
        }
    }
    return false;

    }
}