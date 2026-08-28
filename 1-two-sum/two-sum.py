class Solution:
    def twoSum(self, arr: List[int], target: int) -> List[int]:
        
        d={}
        for index in range(len(arr)):
            num1=arr[index]
            num2=target-num1
            if num2 in d:
                return [index,d[num2]]
            d[num1]=index
        


