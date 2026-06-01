class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        fo=-1
        lo=-1
        low=0
        high=len(nums)-1
        while(low<=high):
            mid=(low+high)//2
            if(nums[mid]==target):
                fo=mid
                high=mid-1
            elif(target<nums[mid]):
                high=mid-1
            else:
                low=mid+1
        low=0
        high=len(nums)-1
        while(low<=high):
            mid=(low+high)//2
            if(nums[mid]==target):
                lo=mid
                low=mid+1
            elif(target<nums[mid]):
                high=mid-1
            else:
                low=mid+1
        return [fo,lo]
        