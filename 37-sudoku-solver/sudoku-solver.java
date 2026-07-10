class Solution {
    public void solveSudoku(char[][] board) {
        backtracking(board);
 
    }
    private boolean backtracking(char[][] board){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(char num='1';num<='9';num++){
                        if(is_valid(board,row,col,num)==true){
                            board[row][col]=num;
                            if(backtracking(board)==true){
                                return true;
                            }
                            board[row][col]='.';
                        } 
                    }
                    return false;
                }
            }
        }
        return true;

    }


      private boolean is_valid(char[][] board, int row,int col,int num){
        int i;
            for(i=0;i<9;i++){
                if(board[row][i]==num || board[i][col]==num){
                    return false;
                }
            }
                int r=(row/3)*3;
                int c=(col/3)*3;
                for(i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        if(board[r+i][c+j]==num){
                            return false;
                        }
                    }
                }

            
             return true;
    }
}


















