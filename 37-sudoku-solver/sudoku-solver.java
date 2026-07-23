class Solution {
        public boolean is_valid(char[][] board,int row,int col,char ch){
        
        int num=ch;
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
    public boolean backtrack(char[][] board){
           for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.') // empty cell
                {
                    // for choice in choices
                    for(char ch='1';ch<='9';ch++){
                        if(is_valid(board,row,col,ch)==true){
                            board[row][col]=ch; //make the move  fill the cell
                            if(backtrack(board)==true){
                                return true;
                            }  // may lead to a solution
                            board[row][col]='.'; // undo the move && try to fill another number
                        }
                    }
                    return false;
                }
            }
        }
        return true; // if all 0-8 rows are filled 

    }
    public void solveSudoku(char[][] board) {
     
        backtrack(board);
    }
}