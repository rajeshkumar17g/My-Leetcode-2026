class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        def backtracking(nums,i):
            if i==len(nums): # if i==len means all swappings are done thats a solution
                res.append(nums[:])# storing a copy of it
                return # we reached a solution, so stop 
            hash=set()
            for j in range(i,len(nums)):
                if nums[j] in hash:
                    continue
                hash.add(nums[j])
                nums[i],nums[j]=nums[j],nums[i] # made a choice
                backtracking(nums,i+1) # tracking the new path
                nums[i],nums[j]=nums[j],nums[i] # undo the choice
        #----------------------------------------------------------------------
        res=[]
        backtracking(nums,0)
        return res
