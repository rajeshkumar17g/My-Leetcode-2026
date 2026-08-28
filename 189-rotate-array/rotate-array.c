void reverse(int* nums,int left,int right){

    while(left<right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right--;
    }
}
void rotate(int* nums, int n, int k) {
    k=k%n;
    reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);

}

/*
 k=k%numsSize;
    for(int j=1;j<=k;j++){

        int last=nums[numsSize-1];
        for(int i=numsSize-1;i>=1;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=last;
    }

*/