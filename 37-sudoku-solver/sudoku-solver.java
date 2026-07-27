class Solution {
        public boolean is_valid(char[][] board,int row,int col,char choice){
        char num=choice;
        // same row or col
        for(int i=0;i<9;i++){
            if(board[row][i]==num && col!=i || board[i][col]==num && row!=i){
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
    public boolean backtracking(char[][] board){
         for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(char choice='1';choice<='9';choice++){
                        if(is_valid(board,row,col,choice)==true){
                            board[row][col]=choice; //making a choice
                            if(backtracking(board)==true){
                                return true;
                            }   // explore that path --> may lead to a solution
                            board[row][col]='.';  //undo the choice

                        }
                    }
                    return false;

                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        backtracking(board);
    }

}