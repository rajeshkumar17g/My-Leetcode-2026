class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length, n=matrix[0].length;
        int r=0,c=n-1;

        while(r<m && c>=0){
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