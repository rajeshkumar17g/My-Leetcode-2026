class Solution:
    def nextGreaterElement(self, nums1: list[int], nums2: list[int]) -> list[int]:
        map={}
        stack=[]

        for num in nums2:

            while len(stack)!=0 and num>stack[-1]:
                map[stack.pop()]=num

            stack.append(num)

        while(stack!=[]):
            map[stack.pop()]=-1
        
        res=[]
        for num in nums1:
            res.append(map[num])
        return res




