class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        sum=0
        for i in range(0,k):
            sum=sum+nums[i]
        
        max=sum
        for i in range(1,len(nums)-k+1):
            sum=sum-nums[i-1]+nums[i+k-1]
            if sum>max:
                max=sum

        return max/k






        '''
        max=float(-inf)
        for i in range(0,len(nums)-k+1):
            sum=0
            for j in range(i,i+k):
                sum=sum+nums[j]
            if sum>max:
                max=sum
        return max/k
        '''
