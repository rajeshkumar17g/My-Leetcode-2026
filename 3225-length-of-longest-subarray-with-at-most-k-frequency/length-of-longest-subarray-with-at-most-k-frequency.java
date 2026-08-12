class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // Intuition: window size never shrinks, only slides; track how many values exceed k
        int n = nums.length;
        int left = 0;
        int bad = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int right = 0; right < n; right++) {
            int c = nums[right];
            int cnt = freq.getOrDefault(c, 0) + 1;
            freq.put(c, cnt);
            if (cnt == k + 1) bad++;
            if (bad == 0) continue;
            int d = nums[left];
            int dc = freq.get(d) - 1;
            freq.put(d, dc);
            if (dc == k) bad--;
            left++;
        }
        return n - left;
    }
}