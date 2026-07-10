class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]!='.'){
                    if(is_valid(board,row,col)==false){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private boolean is_valid(char[][] board, int row,int col){

        // checking row
        for(int i=0;i<9;i++){
            // row is fixed 
            if(col!=i && board[row][col]==board[row][i]){
                return false;
            }
        }

          // checking col
        for(int i=0;i<9;i++){
            // colis fixed 
            if(row!=i && board[row][col]==board[i][col]){
                return false;
            }
        }

        //checking the same grid
        int r=(row/3)*3;
        int c=(col/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((row!=r+i && col!=c+j) && board[row][col]==board[r+i][c+j]){
                    return false;
                }
            }
        }


        return true;
    }
}











