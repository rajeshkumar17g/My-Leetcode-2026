class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        def backtracking(i):
            if i==len(nums):
                res.append(nums[:])
                return
            for j in range(i,len(nums)):
                nums[i],nums[j]=nums[j],nums[i]
                backtracking(i+1)
                nums[i],nums[j]=nums[j],nums[i]
        #----------------------------------------------------
        res=[]
        backtracking(0)   # i=0
        return res