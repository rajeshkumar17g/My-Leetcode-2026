class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        stack=[]
        nextgreater={}
        for num in nums2:
            while stack!=[] and num>stack[-1]:
                nextgreater[stack.pop()]=num
            stack.append(num)
        
        while stack!=[]:
            nextgreater[stack.pop()]=-1
        
        res=[]
        for num in nums1:
            res.append(nextgreater[num])
        return res
