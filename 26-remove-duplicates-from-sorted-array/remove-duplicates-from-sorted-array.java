class Solution {
    public int removeDuplicates(int[] nums) {
        
        int prev=0;
        int crr=1;
        while(crr<nums.length){
            if(nums[prev]==nums[crr]){
                crr++;
            }
            else{
                nums[prev+1]=nums[crr];
                prev++;
                crr++;
            }
        }

        return prev+1;
    }
}