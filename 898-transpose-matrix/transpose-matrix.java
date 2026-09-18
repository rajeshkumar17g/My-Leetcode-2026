class Solution {
    public int[][] transpose(int[][] matrix) {
       int m=matrix.length; //rows
       int n=matrix[0].length; //cols
       int[][] res=new int[n][m]; //res[cols][row]

       for(int i=0;i<n;i++){//cols
        for(int j=0;j<m;j++){//rows
            res[i][j]=matrix[j][i];
        }
       }

       return res;
    }
}


/*

 int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        return matrix;

*/