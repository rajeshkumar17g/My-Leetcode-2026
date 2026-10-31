class Solution {
    public int maxSubArray(int[] nums) {
        
        int max_sum=nums[0];
        int crr_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            crr_sum=Math.max(crr_sum+nums[i],nums[i]);
            max_sum=Math.max(crr_sum,max_sum);
        }

        return max_sum;
    }
}