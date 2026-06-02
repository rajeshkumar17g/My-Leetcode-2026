class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        ans=[0]*len(nums)
        left=0
        right=len(nums)-1
        index=len(nums)-1
        while left<=right:
            if nums[left]**2>nums[right]**2:
                ans[index]=nums[left]**2
                left+=1
            else:
                ans[index]=nums[right]**2
                right-=1
            index-=1
        return ans



        '''
        for index in range(len(nums)):
            nums[index]=nums[index]**2
        nums.sort()
        return nums
        '''