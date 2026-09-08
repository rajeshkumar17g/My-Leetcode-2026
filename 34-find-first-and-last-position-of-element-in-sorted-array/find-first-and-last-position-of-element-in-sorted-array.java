class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int fo=-1;
        int low=0,high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                fo=mid;
                high=mid-1;//search left for fo
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }



        //last occurance
        int lo=-1;
        low=0;
        high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                lo=mid;
                low=mid+1;//search right for lo
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        int[] res=new int[2];
        res[0]=fo;
        res[1]=lo;

        return res;


    }
}