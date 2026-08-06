int pivotInteger(int n) {
    int total=n*(n+1)/2;
    int prefix_sum=0;
   for(int i=1;i<=n;i++){
        prefix_sum=prefix_sum+i;
        if(prefix_sum==(total-prefix_sum+i)){
            return i;
        }
   }
   return -1;
}

/*
 int low=1,high=n;
    int sum=n*(n+1)/2;
    while(low<=high){
        int mid=low+(high-low)/2;
        int ls=mid*(mid+1)/2;
        int rs=sum-ls+mid;

        if(ls==rs){
            return mid;
        }
        else if(ls<rs){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return -1;
    */