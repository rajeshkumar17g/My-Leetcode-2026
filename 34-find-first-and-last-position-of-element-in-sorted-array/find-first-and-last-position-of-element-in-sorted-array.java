class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int fo=-1,lo=-1;

        int low=0,high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==nums[mid]){
                fo=mid;
                high=mid-1;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }


        low=0;
        high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(target==nums[mid]){
                lo=mid;
                low=mid+1;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }


        return new int[]{fo,lo};
    }
}