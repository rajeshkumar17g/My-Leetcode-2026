
class Solution {
    public long dfs(int[][] grid, int row,int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
            return 0;
        }
        long val=grid[row][col];
        grid[row][col]=0;
        return val+dfs(grid,row+1,col)+dfs(grid,row-1,col)+dfs(grid,row,col+1)+dfs(grid,row,col-1);
    }
    public int countIslands(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int c=0;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]!=0){
                   if(dfs(grid,row,col)%k==0){
                    c++;
                   }
                }
            }
        }
        return c;
    }
}