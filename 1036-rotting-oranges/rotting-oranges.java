class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        int fresh=0;
        LinkedList<int[]> q=new LinkedList<>();

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]==2){
                    q.addLast(new int[] {r,c});
                }
                else if(grid[r][c]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }

        int[][] directions=new int[][] {{-1,0},{0,+1},{+1,0},{0,-1}};
        int minutes=0;

        while(!q.isEmpty() && fresh>0){
            int n=q.size();
            minutes++;
            for(int i=0;i<n;i++){

                int[] rot=q.removeFirst();
                for(int[] d: directions){
                    int r=rot[0]+d[0];
                    int c=rot[1]+d[1];

                    if(r>=0 && c>=0 && r<rows && c<cols && grid[r][c]==1){
                        grid[r][c]=2;
                        q.addLast(new int[]{r,c});
                        fresh--;
                    }
                }
            }
        }

        if(fresh==0){
            return minutes;
        }
        return -1;


    }
}