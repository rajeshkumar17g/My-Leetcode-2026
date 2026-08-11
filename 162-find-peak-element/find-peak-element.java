class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int n= nums.length;
        int high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else if(nums[mid]>nums[mid+1]){
                high =mid;
            }
        }
        return low;
    }
}