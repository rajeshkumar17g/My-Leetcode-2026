class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
       int m=matrix.length;//rows
       int n=matrix[0].length;//cols

       int row=0,col=n-1;

      while(row<m && col>=0){
         if(target==matrix[row][col]){
            return true;
        }
        else if(target<matrix[row][col]){
                col--;
        }
        else{
                row++;
        }
      }

      return false;
      
    }
}

/*

  while(top<=bottom){
            System.out.println(top+" "+bottom+" "+left+" "+right);
            if(target>matrix[top][right]){
                top++;
            }
            else{
                int low=left,high=right;

                while(low<=high){
                    int mid=(left+right)/2;

                    if(matrix[top][mid]==target){
                        return true;
                    }
                    else if(target>matrix[top][mid]){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }
                top++;
            }
        }


        return false;

    */