class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        def helper(subset,i):
            if i==len(nums):
                res.append(subset[:])
                return
            
            subset.append(nums[i]) # pick made a move
            helper(subset,i+1) # backtracking # exploring that path
            subset.pop() # undo the move # Not pick
            helper(subset,i+1)
        #-----------------------------
        res=[]
        nums.sort()
        helper([],0) #subset=[]. i=0
        ans=[]
        for subset in res:
            if subset not in ans:
                ans.append(subset)
        return ans