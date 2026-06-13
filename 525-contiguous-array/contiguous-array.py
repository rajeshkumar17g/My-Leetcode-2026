class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        
        seen={0:-1}
        prefix=0
        max_distance=0
        for index in range(len(nums)):
            if nums[index]==0:
                prefix=prefix-1
            else:
                prefix=prefix+1

            if prefix in seen:
                crr_distance=index-seen[prefix]
                max_distance=max(crr_distance,max_distance)
            else:
                seen[prefix]=index # storing its first occurance
        return max_distance
            
