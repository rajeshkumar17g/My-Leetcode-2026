class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        def helper(i,subset):
            if sum(subset)==target:
                res.append(subset[:])
                return
            if i>=len(candidates) or sum(subset)>target:
                return
            subset.append(candidates[i])
            helper(i,subset)
            subset.pop()
            helper(i+1,subset)
        #---------------------
        res=[]
        helper(0,[])
        return res