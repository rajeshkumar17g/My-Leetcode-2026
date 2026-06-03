class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        crr_sum=nums[0]
        max_sum=nums[0]
        for num in nums[1:]:
            if crr_sum+num>num:
                crr_sum+=num
            else:
                crr_sum=num
            if crr_sum>max_sum:
                max_sum=crr_sum
        
        return max_sum