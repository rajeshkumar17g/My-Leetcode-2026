class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        window_sum=0
        for index in range(k):
            window_sum+=nums[index]
        
        max_sum=window_sum
        for i in range(1,len(nums)-k+1):
            window_sum=window_sum-nums[i-1]+nums[i+k-1]
            max_sum=max(max_sum,window_sum)
        
        return max_sum/k

        '''

        max=float(-inf)

        for index in range(len(nums)-k+1):
            sum=0
            for j in range(index,index+k):
                sum=sum+nums[j]
            if sum>max:
                max=sum
            
        return max/k'''