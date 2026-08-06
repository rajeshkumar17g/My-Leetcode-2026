/**
 * Note: The returned array must be malloced, assume caller calls free().
 1. access all elements from l-> r
 2. calculate running sum of it
 3. access all elements from r -> l
 4. calculate running sum of it
 5. access l& r sum array at the same time
 6. take a res array and store abs diff btw left & right sum
 7. return the res
 */
int* leftRightDifference(int* nums, int n, int* returnSize) {
    
    int left_sum[n];
    left_sum[0]=0;
    for(int i=1;i<n;i++){
        left_sum[i]=left_sum[i-1]+nums[i-1];
    }

    int right_sum[n];
    right_sum[n-1]=0;
    for(int i=n-2;i>=0;i--){
      right_sum[i]=right_sum[i+1]+nums[i+1];
    }

    
    *returnSize=n;
    static int res[1000];
    for(int i=0;i<n;i++){
        res[i]=left_sum[i]-right_sum[i];
        if(res[i]<0){
            res[i]=-res[i];
        }
    }
    
    return res;
}