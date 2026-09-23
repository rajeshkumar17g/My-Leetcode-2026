class Solution {
    public int maximumCount(int[] nums) {
        
        //last occurance of neg number
        int low=0,high=nums.length-1;
        int neg_index=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]<0){
                neg_index=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        int neg_count=neg_index+1;
        

         //1st occurance of pos number
        low=0;
        high=nums.length-1;
        int pos_index=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]>0){
                pos_index=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        int pos_count;
        if(pos_index!=-1){
            pos_count=nums.length-pos_index;
        }
        else{
            pos_count=0;
        }

        
        return Math.max(pos_count,neg_count);

    }
}