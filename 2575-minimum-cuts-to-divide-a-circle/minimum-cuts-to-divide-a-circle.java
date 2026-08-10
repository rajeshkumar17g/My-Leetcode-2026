class Solution {
    public int numberOfCuts(int n) {
        if(n%2==0 || n==1){
            return n/2;
        }
        return n;
    }
}