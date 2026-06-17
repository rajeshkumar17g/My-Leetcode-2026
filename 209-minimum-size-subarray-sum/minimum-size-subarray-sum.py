class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        min_length=float(inf)
        left=0
        sum=0
        for right in range(len(nums)):
            sum=sum+nums[right]

            while sum>=target:
                min_length=min(min_length,right-left+1)
                sum=sum-nums[left]
                left+=1
        return min_length if min_length!=float(inf) else 0
            