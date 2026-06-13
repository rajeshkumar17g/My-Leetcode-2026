class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        left_prefix=nums[:]
        right_prefix=nums[:]

        left_prefix[0]=0
        sum=0
        for index in range(1,len(nums)):
            left_prefix[index]=left_prefix[index-1]+nums[index-1]

        right_prefix[-1]=0
        for index in range(-2,-(len(nums)+1),-1):
            right_prefix[index]=right_prefix[index+1]+nums[index+1]

        print(left_prefix)
        print(right_prefix)
        for index in range(len(nums)):
            if left_prefix[index]==right_prefix[index]:
                return index
        return -1
