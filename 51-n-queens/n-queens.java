class Solution {
    public List<List<String>> solveNQueens(int n) {
        ArrayList<Integer> board=new ArrayList<>();
        for(int i=0;i<n;i++){
            board.add(-1);
        }
        List<List<String>> res=new ArrayList<>();
        backtracking(0,n,board,res); // row=0 board={-1,-1,-1,-1} //res=[]
        return res;
    }
    private boolean is_safe(ArrayList<Integer> board,int row,int col){

        for(int i=0;i<row;i++){
            if(board.get(i)==col || (Math.abs(i-row)==Math.abs(board.get(i)-col))){
                return false;
            }
        }
        return true;
    }
    private void backtracking(int row,int n,ArrayList<Integer> board,List<List<String>> res){
        if(row==n){
            ArrayList<String> sol=new ArrayList<>();
           
            for(int i=0;i<n;i++){
                 String r="";
                for(int j=0;j<n;j++){
                    if(j==board.get(i)){
                        r=r+"Q";
                    }
                    else{
                        r=r+".";
                    }
                }
                sol.add(r);
            }

            res.add(new ArrayList(sol));//adding a dup copy of res
            return;
        }
        for(int col=0;col<n;col++){
            if(is_safe(board,row,col)){
                board.set(row,col);
                backtracking(row+1,n,board,res);
                board.set(row,-1);
            }
        }








    }
}