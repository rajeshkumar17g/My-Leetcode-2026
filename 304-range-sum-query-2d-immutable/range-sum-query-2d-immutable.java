class NumMatrix {
    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        prefix=new int[rows+1][cols+1];

        for(int i=1;i<prefix.length;i++){
            for(int j=1;j<prefix[0].length;j++){
                prefix[i][j]=prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1]+matrix[i-1][j-1];
            }
        }


         for(int i=0;i<prefix.length;i++){
            for(int j=0;j<prefix[0].length;j++){
                System.out.print(prefix[i][j]+" ");
            }
            System.out.println();
         }
         



    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefix[row2+1][col2+1]-prefix[row1][col2+1]-prefix[row2+1][col1]+prefix[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */