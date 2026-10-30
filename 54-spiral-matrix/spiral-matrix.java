class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res=new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;

        int top=0, bottom=m-1;
        int left=0,right=n-1;

        while(top<=bottom && left<=right){

            //top => left to right
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            //right => top to bottom
            for(int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;

            //bottom : right to left;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // left : bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
    }
}