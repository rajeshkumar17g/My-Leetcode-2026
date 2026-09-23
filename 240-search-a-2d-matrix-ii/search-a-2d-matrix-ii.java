class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
    int rows=matrix.length-1;
    int cols=matrix[0].length-1;

    for(int i=0;i<=rows;i++){
        for(int j=0;j<=cols;j++){
            if(matrix[i][j]==target){
                return true;
            }
        }
    }
    return false;

    }
}
/*
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

    */