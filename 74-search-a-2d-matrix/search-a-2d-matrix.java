class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0,high=m-1,row=0;
        while(low<high){
            int mid=low+(high-low+1)/2;
            if(target>=matrix[mid][0]){
                low=mid;
            }
            else{
                high=mid-1;
            }
        }
        row=low;
        low=0;high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
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