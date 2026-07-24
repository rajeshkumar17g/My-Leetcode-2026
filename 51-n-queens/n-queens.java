class Solution {
    public boolean is_valid(int[] board,int x2,int y2){
        for(int x1=0;x1<x2;x1++){
            int y1=board[x1];
            if(y1==y2 || Math.abs(x1-x2)==Math.abs(y1-y2)){
                return false;
            }
        }
        return true;
    }
    public void backtracking(int n, int[] board,List<List<String>> res,int row){
        if(row==n){ //board[1,3,0,2];
            ArrayList<String> copy=new ArrayList<>();
            for(int i=0;i<n;i++){
                String row_list="";
                for(int j=0;j<n;j++){
                    if(board[i]==j){
                       row_list+="Q";
                    }
                    else{
                       row_list+=".";
                    }
                }
                copy.add(row_list);
            }
            res.add(copy);
            return;
        }

        for(int col=0;col<n;col++){
            if(is_valid(board,row,col)==true){
                board[row]=col; //make the move
                backtracking(n,board,res,row+1);// may lead to a solution
                board[row]=-1;  //undo the move
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res= new ArrayList<>();
        int[] board=new int[n];
        Arrays.fill(board,-1);

        backtracking(n,board,res,0);

        return res;

    }
}