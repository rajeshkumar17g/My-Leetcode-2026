class Solution {
    
    public int climbStairs(int n) {
       int f1=1,f2=2,f3=0;
      if(n<=2){
        return n;
      }
      else{
        for(int i=3;i<=n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
      }
      return f3;
    }
}

/*
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
    */