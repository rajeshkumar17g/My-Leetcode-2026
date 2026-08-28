int removeDuplicates(int* nums, int numsSize) {

    int prev=0,crr=1;
    while(crr<numsSize){
        if(nums[crr]==nums[prev]){
            crr++;
        }
        else{
            nums[prev+1]=nums[crr];
            prev++;
            crr++;
        }
    }
    return prev+1;

}