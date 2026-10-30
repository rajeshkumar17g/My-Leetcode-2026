class Solution {
    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(r<c){
                    int temp=matrix[r][c];
                    matrix[r][c]=matrix[c][r];
                    matrix[c][r]=temp;
                }
            }
        }

        
        //reverse every row

        for(int[] row: matrix){
            int left=0;
            int right=cols-1;

            while(left<right){
                int temp=row[left];
                row[left]=row[right];
                row[right]=temp;

                left++;
                right--;
            }
        }
    }
}