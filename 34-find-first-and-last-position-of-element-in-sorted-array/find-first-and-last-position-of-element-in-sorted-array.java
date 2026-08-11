class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int low=0,high=nums.length-1;
        int fo=-1;

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
        int lo=-1;

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
/*
1. finding 1st occurance
    fo=-1
    bs: target==nums[mid]: update fo and move left
2. last occurance
*/
