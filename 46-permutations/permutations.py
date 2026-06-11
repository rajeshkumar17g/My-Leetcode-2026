class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        
        # [a, b, c]
        #  0. 1. 2
        #.           ==3. i==len(nums) 
        #.       j.  2
        def backtracking(nums,i):
            if i==len(nums): # if i==len means all swappings are done thats a solution
                res.append(nums[:])# storing a copy of it
                return # we reached a solution, so stop 
                
            for j in range(i,len(nums)):
                nums[i],nums[j]=nums[j],nums[i] # made a choice
                backtracking(nums,i+1) # tracking the new path
                nums[i],nums[j]=nums[j],nums[i] # undo the choice
        #----------------------------------------------------------------------
        res=[]
        backtracking(nums,0)
        return res
