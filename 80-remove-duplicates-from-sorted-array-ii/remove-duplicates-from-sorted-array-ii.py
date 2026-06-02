class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        prev=2
        crr=2
        while(crr<len(nums)):
            if nums[crr]!=nums[prev-2]:
                nums[prev]=nums[crr]
                prev+=1
                crr+=1
            else:
                crr=crr+1
        return prev