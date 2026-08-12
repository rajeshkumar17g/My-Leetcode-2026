class Solution {
    public void moveZeroes(int[] nums) {
        int prev=0,crr=0;

        while(crr<nums.length){
            if(nums[crr]!=0){
                int temp=nums[prev];
                nums[prev]=nums[crr];
                nums[crr]=temp;
                prev++;
            }
            crr++;
        }


    }
}