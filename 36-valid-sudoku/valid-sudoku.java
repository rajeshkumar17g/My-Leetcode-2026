class Solution {
    public boolean is_valid(char[][] board,int row,int col){
        
        int num=board[row][col];
        // rows
        for(int i=0;i<9;i++){
            if(board[row][i]==num && i!=col){
                return false;
            }
        }
         // cols
        for(int i=0;i<9;i++){
            if(board[i][col]==num && i!=row){
                return false;
            }
        }

        int r=(row/3)*3;
        int c=(col/3)*3;

        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]==num && (i!=row && j!=col)){
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