/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    // first occurance
    int low=0,high=numsSize-1;
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

    // first occurance
    low=0,high=numsSize-1;
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

    static int arr[2];
    arr[0]=fo;
    arr[1]=lo;
    *returnSize=2;
    return arr;


}