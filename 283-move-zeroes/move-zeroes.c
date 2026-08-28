void moveZeroes(int* nums, int numsSize) {
    int prev=0,crr=0;

    while(crr<numsSize){
        if(nums[crr]!=0){
            int temp=nums[crr];
            nums[crr]=nums[prev];
            nums[prev]=temp;
            prev++;
            crr++;
        }
        else{
            crr++;
        }
    }
}