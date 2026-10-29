class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n=mat.length;
        int sum=0;

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if(r==c || r+c==n-1){
                    sum=sum+mat[r][c];
                }
            }
        }

        return sum;
    }
}