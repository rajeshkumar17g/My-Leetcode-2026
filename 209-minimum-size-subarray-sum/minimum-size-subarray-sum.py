class Solution:
    def minSubArrayLen(self, target: int, nums: list[int]) -> int:
        left=0
        crr_sum=0
        min_length=100001 # assuming 

        for right in range(0,len(nums)):
            crr_sum=crr_sum+nums[right]

            while(crr_sum>=target):
                min_length=min(min_length,right-left+1)
                crr_sum=crr_sum-nums[left]
                left=left+1
        if(min_length==100001):
            return 0
        return min_length





'''

public int fn(int[] arr) {
    int left = 0, ans = 0, curr = 0;

    for (int right = 0; right < arr.length; right++) {
        // do logic here to add arr[right] to curr

        while (WINDOW_CONDITION_BROKEN) {
            // remove arr[left] from curr
            left++;
        }

        // update ans
    }

    return ans;
}
'''