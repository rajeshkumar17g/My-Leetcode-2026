class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        def helper(i,subset):
            if len(subset)==k:
                res.append(subset[:])
                return
            if i>n:
                return
            subset.append(i)
            helper(i+1,subset)
            subset.pop()
            helper(i+1,subset)
        #---------------------
        res=[]
        helper(1,[])
        return res