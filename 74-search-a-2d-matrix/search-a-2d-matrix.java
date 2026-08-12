class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row=0;
        int m=matrix.length,n=matrix[0].length;

        int low=0,high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][n-1]){
                row=mid;
                break;
            }
            else if(target>matrix[mid][n-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(row);
        low=0;
        high=n-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(target==matrix[row][mid]){
                return true;
            }
            else if(target<matrix[row][mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
        

    }
}