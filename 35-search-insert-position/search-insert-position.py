class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        low=0
        high=len(nums)-1

        while(low<=high):
            mid=(low+high)//2 # integer divison
            if(target==nums[mid]):
                return mid # found the element return
            elif(target<nums[mid]):
                high=mid-1
            else:
                low=mid+1
        return low