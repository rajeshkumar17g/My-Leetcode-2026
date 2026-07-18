class Solution {
    public void dfs(char[][] grid,int row,int col){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        dfs(grid,row,col+1);//right
        dfs(grid,row,col-1);//left
        dfs(grid,row+1,col);//down
        dfs(grid,row-1,col);//up

    }
    public int numIslands(char[][] grid) {
        int count=0;
        int rows=grid.length;
        int cols=grid[0].length;

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]=='1'){
                    dfs(grid,r,c);
                    count++;
                }
            }
        }

        return count;
    }
}