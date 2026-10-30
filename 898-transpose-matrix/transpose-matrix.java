class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int rows=matrix.length;
        int cols=matrix[0].length;

        int[][] res=new int[cols][rows];

        for(int r=0;r<cols;r++){
            for(int c=0;c<rows;c++){
                res[r][c]=matrix[c][r];
            }
        }

        return res;
    }
}


/*

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

        return matrix;
        */