class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        
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
        helper([],0) #subset=[]. i=0
        return res