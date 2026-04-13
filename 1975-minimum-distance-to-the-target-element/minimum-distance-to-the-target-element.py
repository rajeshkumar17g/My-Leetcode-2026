class Solution:
    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
        min=float(inf)
        for index in range(len(nums)):
            if nums[index]==target:
                 if abs(index-start)<min:
                    ans=index
                    min=abs(index-start)
        return min

