class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        for(int index=0;index<nums.length;index++){
            res=res^nums[index];
        }
        return res;
    }
}