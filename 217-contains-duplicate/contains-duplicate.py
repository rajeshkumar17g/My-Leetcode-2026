class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        d={}
        
        for ele in nums:
            if ele in d:
                d[ele]=d[ele]+1
            else:
                d[ele]=1

        for k,v in d.items():
            if(v>=2):
                return True

        return False