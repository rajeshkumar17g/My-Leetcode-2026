class Solution {
    public int mySqrt(int x) {
        if(x==0|| x==1){
            return x;
        }
        long n;
        for(n=0;n<x;n++){
            long sq=n*n;
            if(sq>x){
                break;
            }
        }

        return (int)n-1;
    }
}