class Solution {
    public void dfs(char[][] grid, int row,int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]=='1'){
                    dfs(grid,row,col);
                    count++;
                }
            }
        }
        return count;
    }
}