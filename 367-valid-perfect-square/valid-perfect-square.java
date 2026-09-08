class Solution {
    public boolean isPerfectSquare(int x) {
        
        long low=0,high=x;
        while(low<=high){
            long mid=low+(high-low)/2;

            if(mid*mid==x){
                return true;//perfect square
            }
            else if(mid*mid>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return false;
    }
}