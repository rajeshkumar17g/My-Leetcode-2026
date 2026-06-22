class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        crr_sum=0
        for index in range(0,k):
            crr_sum+=nums[index]

        max_sum=crr_sum
        for index in range(1,len(nums)-k+1):
            crr_sum=crr_sum-nums[index-1]+nums[index+k-1]
            max_sum=max(crr_sum,max_sum)
        
        return max_sum/k

        '''
        1. calculate the 1st window sum


        max_subarray=float(-inf)
        for index in range(0,len(nums)-k+1):
            sum=0
            for j in range(index,index+k):
               sum=sum+nums[j]
            if(sum>max_subarray):
                max_subarray=sum
        
        return max_subarray/k
        '''