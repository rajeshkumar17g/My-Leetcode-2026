class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
       
        window_dict={}
        for i,num in enumerate(nums):
            if num in window_dict and abs(i-window_dict[num])<=k:
                return True
            window_dict[num]=i
        return False

