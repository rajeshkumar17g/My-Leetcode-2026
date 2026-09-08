class Solution {
    public int mySqrt(int x) {
        
        long low=0,high=x;
        while(low<=high){
            long mid=low+(high-low)/2;

            if(mid*mid==x){
                return (int)mid;//perfect square
            }
            else if(mid*mid>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return (int)high;
    }
}

/*

long i;
        for(i=1;i<=x;i++){
            if(i*i>x){
               break;
            }
        }

        return (int)i-1;*/