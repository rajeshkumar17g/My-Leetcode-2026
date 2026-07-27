class Solution {
    public boolean is_valid(char[][] board,int row,int col){
        char num=board[row][col];
        // same row
        for(int i=0;i<9;i++){
            if(board[row][i]==num && col!=i){
                return false;
            }
        }
        // same col
        for(int i=0;i<9;i++){
            if(board[i][col]==num && row!=i){
                return false;
            }
        }

        int r=(row/3)*3;
        int c=(col/3)*3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(num==board[i][j] && (i!=row && j!=col)){
                    return false;
                }
            }
        }

        return true;
    }
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
}