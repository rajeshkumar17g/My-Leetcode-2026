class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for row in range(len(nums)-1):
            for col in range(row+1,len(nums)):
                if(nums[row]+nums[col]==target):
                    return [row,col]