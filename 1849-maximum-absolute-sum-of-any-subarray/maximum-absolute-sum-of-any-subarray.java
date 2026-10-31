class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
    int res = 0, max_sum = 0, min_sum = 0;
    for (int n : nums) {
        max_sum = Math.max(0, n + max_sum);
        min_sum = Math.min(0, n + min_sum);
        res = Math.max(Math.max(res, max_sum),-min_sum);
    }
    return res;
    }
}