class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] min_array=new int[n];
        min_array[0]=prices[0];
        int profit=0;


        for(int i=1;i<n;i++){
            int selling=prices[i];
            int purchasing=min_array[i-1];
            profit=Math.max(profit,selling-purchasing);
            min_array[i]=Math.min(min_array[i-1],prices[i]);
        }
        

        return profit;


    }
}