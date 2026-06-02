class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        crr=0
        prev=0
        while crr<len(nums):
            if nums[crr]!=0:
                nums[prev],nums[crr]=nums[crr],nums[prev]
                prev+=1
            crr+=1
        
        