class Solution:
    '''
    10 10 20 30 30 40 40  50 50 60 60 
     0  1  2  3  4  5  6  7  8  9  10 
     l     m     h  m               

    '''
    def singleNonDuplicate(self, nums: List[int]) -> int:
        low=0
        high=len(nums)-1
        while(low<high):
            mid=(low+high)//2
            print(low,high,mid)
            if(nums[mid]!=nums[mid+1] and nums[mid]!=nums[mid-1]):
                return nums[mid]
            elif(nums[mid]==nums[mid-1]):
                if((mid-1)%2==0):
                    low=mid+2
                else:
                    high=mid-2
            else:
                if((mid)%2==0):
                    low=mid+2
                else:
                    high=mid-1
        return nums[high]