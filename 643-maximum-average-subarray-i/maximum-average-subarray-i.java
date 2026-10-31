class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int window_sum=0;
        for(int i=0;i<k;i++){
            window_sum=window_sum+nums[i];
        }

        int max=window_sum;
        for(int i=k;i<nums.length;i++){
            window_sum=window_sum+nums[i]-nums[i-k];
            max=Math.max(window_sum,max);
        }

        return (double)max/k;

    }
}