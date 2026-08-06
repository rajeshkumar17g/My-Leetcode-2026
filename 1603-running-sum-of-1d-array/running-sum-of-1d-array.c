int* runningSum(int* nums, int n, int* returnSize) {
    for(int i=1;i<n;i++){
        nums[i]=nums[i-1]+nums[i];
    }
    *returnSize=n;
    return nums;
}