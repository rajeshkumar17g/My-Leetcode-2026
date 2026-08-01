class Solution {
    public int maxvalue(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }

        return Math.max(
            nums[start] - maxvalue(nums, start + 1, end),
            nums[end] - maxvalue(nums, start, end - 1)
        );
    }

    public boolean predictTheWinner(int[] nums) {
        return maxvalue(nums, 0, nums.length - 1) >= 0;
    }
}