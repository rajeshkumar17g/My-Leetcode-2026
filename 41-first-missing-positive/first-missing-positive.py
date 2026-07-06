class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n = len(nums)
        for i in range(n):
            if nums[i] == (i+1):
                continue

            
            idx = nums[i]-1
            while idx < n and idx >= 0:
                temp = nums[idx]

                if nums[idx] == (idx+1):
                    break
                nums[idx] = idx+1
                idx = temp - 1

        # print(nums)
        for i in range(n):
            if nums[i] != i+1:
                return i+1

        return n+1

        

        