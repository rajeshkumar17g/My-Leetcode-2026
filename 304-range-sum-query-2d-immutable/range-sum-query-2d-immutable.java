class NumMatrix {

    int[][] prefix;
    public NumMatrix(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        prefix=new int[rows+1][cols+1];

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                 prefix[i][j]=prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1]+matrix[i-1][j-1];
            }
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


 class NumMatrix:

    def __init__(self, matrix: list[list[int]]):
        rows=len(matrix)
        cols=len(matrix[0])

        self.prefix=[]
        for r in range(rows+1):
            self.prefix.append([0]*(cols+1))

        for i in range(1,rows+1):
            for j in range(1,cols+1):
                self.prefix[i][j]=self.prefix[i-1][j]+self.prefix[i][j-1]-self.prefix[i-1][j-1]+matrix[i-1][j-1]
    


    def sumRegion(self, row1: int, col1: int, row2: int, col2: int) -> int:
        return self.prefix[row2+1][col2+1]-self.prefix[row1][col2+1]-self.prefix[row2+1][col1]+self.prefix[row1][col1]
 */