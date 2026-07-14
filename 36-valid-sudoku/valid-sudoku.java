class Solution {
    private boolean is_valid(char[][] board,int row,int col){
        int num=board[row][col];
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