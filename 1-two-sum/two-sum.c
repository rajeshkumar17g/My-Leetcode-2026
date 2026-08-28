/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int n, int target, int* returnSize) {
    static int res[2];
    *returnSize=2;

    for(int row=0;row<n-1;row++){
        for(int col=row+1;col<n;col++){
           if(nums[row]+nums[col]==target){
            res[0]=row;
            res[1]=col;
            return res;
           }
        }
    }

    return res;
    
}