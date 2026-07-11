class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
       def backtracking(i,subset):
            if(i==len(nums)): # curr_state==sol_state
                res.append(subset[:]) # adding a copy of subset
                return
            subset.append(nums[i]) # make the move # pick
            backtracking(i+1,subset) # backtrack
            subset.remove(nums[i]) # undo the move  # noty pick
            backtracking(i+1,subset) # backtrack 
       #----------------------------------------
       res=[]
       nums.sort()
       backtracking(0,[]) # i=0 subset=[]
       ans=[]

       for subset in res:
        if subset not in ans:
            ans.append(subset)
       return ans