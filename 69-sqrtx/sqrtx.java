class Solution {
    public int mySqrt(int num) {
        long low=0,high=num;

        while(low<=high){
            long mid=low+(high-low)/2;
            long sq=(mid*mid);
            if(sq==(long)num){
                return (int)mid;
            }
            else if(sq>(long)num){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)high;
    }
}