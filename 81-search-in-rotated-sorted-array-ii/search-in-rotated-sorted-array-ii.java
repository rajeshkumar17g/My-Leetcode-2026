class Solution {
    public boolean search(int[] nums, int target) {
        int low=0,high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==nums[mid]){
                return true;
            }
            
            if (nums[mid] == nums[low]) {
                low++;
                continue;
            }
            //left is sorted
            if(nums[low]<=nums[mid]){
                //element is present in sorted region
                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            //right is sorted
            else{
                //element is present in sorted region
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }

    return false;

    }
}