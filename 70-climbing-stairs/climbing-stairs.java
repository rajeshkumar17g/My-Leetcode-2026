class Solution {
    int[] dp;
    public int climbStairs(int n) {
       dp=new int[n+1];
       dp[0]=1;
       dp[1]=1;
       return memo(n);
    }
     public int memo(int n){
        if(n<2){
            return dp[n];
        }
        else{
            if(dp[n]==0){
                dp[n]=memo(n-1)+memo(n-2);
            }
            return dp[n];
        }
    }
}