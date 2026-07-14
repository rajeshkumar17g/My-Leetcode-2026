class Solution {
    private void dfs(char[][] grid,int row,int col){
        if(row<0 || col<0 || row>=grid.length || col>=grid[row].length|| grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        dfs(grid,row-1,col); //up
        dfs(grid,row+1,col);//down
        dfs(grid,row,col-1); //left
        dfs(grid,row,col+1); //right




    }
    public int numIslands(char[][] grid) {
        int islands=0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                if(grid[row][col]=='1'){
                    islands++;
                    dfs(grid,row,col);
                }
            }
        }
        return islands;
    }
}