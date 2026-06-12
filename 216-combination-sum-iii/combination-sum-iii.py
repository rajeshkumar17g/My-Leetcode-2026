class Solution:
    def combinationSum3(self, k: int, n: int) -> List[List[int]]:
        
        def helper(i,subset):
            if len(subset)==k and sum(subset)==n:
                res.append(subset[:])
                return
            if i>9 or sum(subset)>n:
                return

            subset.append(i)
            helper(i+1,subset)
            subset.pop()
            helper(i+1,subset)
        #---------------------------------------
        res=[]
        helper(1,[])
        return res