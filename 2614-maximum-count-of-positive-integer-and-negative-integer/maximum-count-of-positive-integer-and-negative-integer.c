int maximumCount(int* nums, int numsSize) {
    
    int pcount=0,ncount=0;
    for(int index=0;index<numsSize;index++){
        if(nums[index]>0){
            pcount++;
        }
        else if(nums[index]<0){
            ncount++;
        }
    }

    return (pcount>ncount)?pcount:ncount;
}