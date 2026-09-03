class Solution {
    public void moveZeroes(int[] nums) {
        
        int prev=0,crr=0;

        while(crr<nums.length){
            if(nums[crr]==0){
                crr++;
            }
            else{
                int temp=nums[crr];
                nums[crr]=nums[prev];
                nums[prev]=temp;
                prev++;
                crr++;
            }
        }
    }
}