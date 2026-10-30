class Solution {
    public int mySqrt(int num) {
                
        long low=0,high=num;

        while(low<=high){
            long mid=low+(high-low)/2;

            if(mid*mid==num){
                return (int)mid;
            }
            else if(mid*mid>num){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return (int)high;
    }
}