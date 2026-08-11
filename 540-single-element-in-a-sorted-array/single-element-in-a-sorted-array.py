class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]

        if nums[0] != nums[1]:
            return nums[0]

        if nums[-1] != nums[-2]:
            return nums[-1]

        low = 1
        high = len(nums) - 2

        while low <= high:
            mid = (low + high) // 2

            if nums[mid] != nums[mid + 1] and nums[mid] != nums[mid - 1]:
                return nums[mid]

            elif nums[mid] == nums[mid - 1]:
                if (mid - 1) % 2 == 0:
                    low = mid + 1
                else:
                    high = mid - 2

            else:
                if mid % 2 == 0:
                    low = mid + 2
                else:
                    high = mid - 1
