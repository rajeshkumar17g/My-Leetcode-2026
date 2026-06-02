class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        
        for index in range(len(nums)):
            nums[index]=nums[index]**2
        nums.sort()
        return nums