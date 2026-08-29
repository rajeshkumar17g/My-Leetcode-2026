/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* num, int n, int target, int* returnSize) {
    
    static int res[2];
    *returnSize=2;
    int left=0,right=n-1;
     
     while(left<right){
        if(num[left]+num[right]==target){
            res[0]=left+1;
            res[1]=right+1;
            break;
        }
        else if(num[left]+num[right]>target){
            right--;
        }
        else{
            left++;
        }
     }

     return res;

}