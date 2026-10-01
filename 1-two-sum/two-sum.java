class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int r=0;r<n-1;r++){
            for(int c=r+1;c<n;c++){
               if(nums[r]+nums[c]==target)
               {
                return new int[]{r,c};
               }
            }
           
        }


        return nums;//dummy
    }
}