class Solution:
    def dailyTemperatures(self, temp: list[int]) -> list[int]:
        
        stack=[]
        ans=[0]*len(temp)

        for i in range(len(temp)):

            while(stack!=[] and temp[stack[-1]]<temp[i]):
                idx=stack.pop()
                ans[idx]=i-idx

            stack.append(i)
        
        return ans