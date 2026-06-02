class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        s=set(nums)
        s=list(s)
        s.sort()
        for index in range(len(s)):
            nums[index]=s[index]
        return len(s)