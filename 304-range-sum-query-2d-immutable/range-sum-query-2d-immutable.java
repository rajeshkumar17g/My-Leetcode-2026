class NumMatrix {

    int[][] prefix_mat;
    public NumMatrix(int[][] matrix) {
        
        int rows=matrix.length;
        int cols=matrix[0].length;

        prefix_mat=new int[rows+1][cols+1];

        for(int r=1;r<=rows;r++){
            for(int c=1;c<=cols;c++){
                prefix_mat[r][c]=prefix_mat[r][c-1]+prefix_mat[r-1][c]-prefix_mat[r-1][c-1]+matrix[r-1][c-1];
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefix_mat[row2+1][col2+1]-prefix_mat[row1][col2+1]-prefix_mat[row2+1][col1]+prefix_mat[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */