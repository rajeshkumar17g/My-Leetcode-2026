class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n=len(temperatures)
        res=[0]*n
        stack=[]
        for crr_index in range(n):
            while stack!=[] and temperatures[stack[-1]]<temperatures[crr_index]:
                idx=stack.pop()
                diff=crr_index-idx
                res[idx]=diff
            stack.append(crr_index)

        return res