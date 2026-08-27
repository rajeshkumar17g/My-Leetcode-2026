int* searchRange(int* nums, int numsSize, int target, int* returnSize) {

            *returnSize=2;
            // first occurance
            int low=0,high=numsSize-1;
            static int res[2]; // res[0]=first occ   res[1]=l;ast

            res[0]=-1;
            while(low<=high){
                int mid=low+(high-low)/2;

                if(target==nums[mid]){
                    res[0]=mid;
                    high=mid-1;
                }
                else if(target>nums[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }




              // last occurance
            low=0,high=numsSize-1;
           

            res[1]=-1;
            while(low<=high){
                int mid=low+(high-low)/2;

                if(target==nums[mid]){
                    res[1]=mid;
                    low=mid+1;
                }
                else if(target>nums[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }

            return res;


}