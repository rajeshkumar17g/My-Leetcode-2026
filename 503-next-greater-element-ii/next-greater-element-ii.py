class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        stack=[]
        nextgreater={}
        for index in range(len(nums)):
            nextgreater[index]=-1

        for index in range(0,2*len(nums)):
            index=index%len(nums)
            num=nums[index]
            while stack!=[] and num>nums[stack[-1]]:
                nextgreater[stack.pop()]=num
            stack.append(index)
            
        res=[]
        for index in range(len(nums)):
            res.append(nextgreater[index])
        
        return res
