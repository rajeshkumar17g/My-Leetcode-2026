class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
    
        for(int i=2;i<=n;i++){
            
            int step1=cost[i-1]+dp[i-1];
            int step2=cost[i-2]+dp[i-2];

            dp[i]=Math.min(step1,step2);
        }
    
        return dp[n];
    }


}