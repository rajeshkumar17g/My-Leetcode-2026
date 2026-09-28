class Solution {
    public boolean isPerfectSquare(int num) {
         long low=1,high=num;

        while(low<=high){
            long mid=low+(high-low)/2;

            if(num==mid*mid){
                return true;
            }
            else if(num>mid*mid){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return false;
    }
}