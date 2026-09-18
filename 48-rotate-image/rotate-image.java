class Solution {
    public void reverse(int [][] matrix,int row, int left, int right){

        while(left<right){
            int temp=matrix[row][left];
            matrix[row][left]=matrix[row][right];
            matrix[row][right]=temp;

            left++;
            right--;
        }
    }
    public void rotate(int[][] matrix) {
        
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }

        for(int row=0;row<n;row++){
            reverse(matrix,row,0,n-1);
        }





    }
}