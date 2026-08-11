class Solution {
    public int findPeakElement(int[] nums) {
        
        int low=0,high=nums.length-1,mid=high;

        while(low<high){
            mid=low+(high-low)/2;
            if(mid+1<nums.length && nums[mid]>nums[mid+1] && mid-1>=0 && nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
        
    }
}