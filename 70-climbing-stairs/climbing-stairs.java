class Solution {
    int[] dp;
    public int fib(int n){
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=fib(n-1)+fib(n-2);
        return dp[n];
    }
    public int climbStairs(int n) {
        dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        return fib(n);
    }
}


/*

if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);

*/