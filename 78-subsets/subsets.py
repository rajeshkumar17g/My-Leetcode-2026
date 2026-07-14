class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        def backtracking(i,subset):
            res.append(subset[:])
            for j in range(i,len(nums)):
                subset.append(nums[j])
                backtracking(j+1,subset)
                subset.pop()
        #---------------------------------------------
        res=[]
        backtracking(0,[])
        return res




        '''
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
        backtracking(0,[]) # i=0 subset=[]
        return res
        '''