int* twoSum(int* nums, int n, int target, int* returnSize) {

    static int res[2];

    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j]==target){
                res[0]=i;
                res[1]=j;
            }
        }
        printf("\n");
    }
    *returnSize=2;
    return res;
}