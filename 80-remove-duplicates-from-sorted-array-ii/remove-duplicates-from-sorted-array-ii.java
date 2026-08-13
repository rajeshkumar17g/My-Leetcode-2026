class Solution {
    public int removeDuplicates(int[] nums) {
       int prev=2;
       int crr=2;

       while(crr<nums.length){
            if(nums[crr]!=nums[prev-2]){
                nums[prev]=nums[crr];
                prev++;
            }
            crr++;
       }
       return prev;
    }
}