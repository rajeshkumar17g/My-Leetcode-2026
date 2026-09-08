class Solution {
    public int mySqrt(int x) {
        long i;
        for(i=1;i<=x;i++){
            if(i*i>x){
               break;
            }
        }

        return (int)i-1;
    }
}