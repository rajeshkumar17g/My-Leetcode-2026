class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        res=[]
        for ele in nums:
            if nums.count(ele)==2:
                res.append(ele)
        return list(set(res))