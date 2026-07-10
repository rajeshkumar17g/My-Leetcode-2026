class Solution {
    public int singleNonDuplicate(int[] nums) {
       int low=0;
       int high=nums.length-1;
       while(low<high){
            int mid=low+(high-low)/2;
            if(mid%2==1){
                mid=mid-1;
            }
            if(nums[mid]==nums[mid+1]){
                    low=mid+2;
            }
            else{
                high=mid-1;
            }
       }
       return nums[low];
    }
}


/*


 int sum=0;
        for(int ele: nums){ //O(n)
            sum=sum^ele;
        }
        return sum;*/