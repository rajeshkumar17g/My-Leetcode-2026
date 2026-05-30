class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        low=0
        high=len(nums)-1

        while (low<=high):
            mid=(low+high)//2
            if(mid%2==1):
                if(nums[mid]==nums[mid-1]):
                    low=mid+1
                else:
                    high=mid-1
            else:
                if(nums[mid]==nums[mid-1]):
                    high=mid-1
                else:
                    low=mid+1
        if mid%2==0:
            return nums[mid]
        else:
            return nums[mid-1]
            
        '''


        ans=0
        for ele in nums:
            ans=ans^ele
        return ans


        if len(nums)==1:
            return nums[0]
        for index in range(0,len(nums),2):
            if index+1<len(nums) and nums[index]!=nums[index+1]:
                return nums[index]

        return nums[-1]
        '''