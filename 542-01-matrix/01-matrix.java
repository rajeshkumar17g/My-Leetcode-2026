class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;

       
        LinkedList<int[]> q = new LinkedList<>();

        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (mat[i][j]==0){
                    q.addLast(new int[]{i, j});
                }else{
                    mat[i][j]=Integer.MAX_VALUE;
                }
            }
        }


        int[][] directions={{0, 1},{0, -1},{1, 0},{-1, 0}};

        while (!q.isEmpty()){
            int[] cell=q.removeFirst();

            for (int[] direction :directions) {
                int r=cell[0]+direction[0];
                int c=cell[1]+direction[1];

                if (r>=0 && r<rows && c>=0 && c<cols && mat[r][c] > mat[cell[0]][cell[1]]+1) {
                    mat[r][c]=mat[cell[0]][cell[1]]+1;
                    q.add(new int[]{r,c});
                }
            }
        }

        return mat;        
    }
}