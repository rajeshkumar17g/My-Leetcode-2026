class Solution {
    public void moveZeroes(int[] nums) {
        
        int crr=0,prev=0;

        while(crr<nums.length){
            if(nums[crr]==0){
                crr++;
            }
            else{
                int temp=nums[prev];
                nums[prev]=nums[crr];
                nums[crr]=temp;

                prev++;
                crr++;
            }
        }
    }
}