class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        k=k%len(nums)
        nums[::]=nums[-k:]+nums[:-k]
        """

        def rev(nums,left,right):
            while left<=right:
                nums[left],nums[right]=nums[right],nums[left]
                left+=1
                right-=1
        #-------------------------------------------------

        k=k%len(nums)
        n=len(nums)-1
        rev(nums,0,n)
        rev(nums,0,k-1)
        rev(nums,k,n)
        