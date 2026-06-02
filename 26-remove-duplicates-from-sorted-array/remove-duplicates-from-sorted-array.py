class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        prev=0
        crr=0
        while crr<len(nums):
            if nums[prev]==nums[crr]:
                crr+=1
            else:
                nums[prev+1]=nums[crr]
                crr+=1
                prev+=1
        return prev+1