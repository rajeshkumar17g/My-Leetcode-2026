
class Solution {
    public int dfs(int[][] grid, int row,int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
            return 1;
        }
        if(grid[row][col]==2){
            return 0;
        }
        grid[row][col]=2;
        return dfs(grid,row+1,col)+dfs(grid,row-1,col)+dfs(grid,row,col+1)+dfs(grid,row,col-1);
    }
   public int islandPerimeter(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int peri=0;
        for(int row=0;row<m;row++){
           for(int col=0;col<n;col++){
                if(grid[row][col]==1){
                    peri=dfs(grid,row,col);
                }
            }
        }
        return peri;
    }
}