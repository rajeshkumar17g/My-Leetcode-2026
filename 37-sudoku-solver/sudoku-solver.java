class Solution {
     private boolean is_valid(char[][] board,int row,int col, int num){
        for(int i=0;i<9;i++){
            if((col!=i && num==board[row][i]) || (row!=i && num==board[i][col])){
                return false;
            }   
        }
        int rs=(row/3)*3;
            int cs=(col/3)*3;
            for(int r=rs;r<rs+3;r++){
                for(int c=cs;c<cs+3;c++){
                    if(num==board[r][c] && (row!=r && col!=c)){
                        return false;
                    }
                }
            }
            return true;
    }
    private boolean backtracking(char[][] board){
         for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    for(char num='1';num<='9';num++){
                        if(is_valid(board,r,c,num)){
                            board[r][c]=num; //make the move
                            if(backtracking(board)==true){
                                return true;
                            }
                            board[r][c]='.'; //undo the move
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