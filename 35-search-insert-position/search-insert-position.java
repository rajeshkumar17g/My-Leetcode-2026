class Solution {
    public int searchInsert(int[] nums, int target) {
       int low=0,high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low; 
    }
}