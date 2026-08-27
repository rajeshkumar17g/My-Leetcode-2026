int maximumCount(int* nums, int numsSize) {
    
    int ng=-1;
    int low=0,high=numsSize-1;

    while(low<=high){
        int mid=low+(high-low)/2;

        if(nums[mid]<0){
            ng=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    int ncount=ng+1;


 int po=-1;
    low=0,high=numsSize-1;

    while(low<=high){
        int mid=low+(high-low)/2;

        if(nums[mid]>0){
            po=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }

    int pcount;
    if(po!=-1)
        pcount=numsSize-po;
    else
        pcount=0;

    return (pcount>ncount)?pcount:ncount;
}


/*

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
*/
