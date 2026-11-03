class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        
        n=len(nums)
        res=[0]*n

        prefix=1
        for i in range(n):
            res[i]=prefix
            prefix=prefix*nums[i]

        sufix=1
        for i in range(n-1,-1,-1):
            res[i]=res[i]*sufix
            sufix=sufix*nums[i]

        return res
        
