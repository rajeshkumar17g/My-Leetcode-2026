class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        s=min(nums)
        e=max(nums)
        res=[]
        for i in range(s,e+1):
            if i not in nums:
                res.append(i)
        return res