void reverse(int* arr, int left,int right){

    while(left<=right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }

}
void rotate(int* arr, int n, int k) {
    
    k=k%n; // maximum length number of rotations we have to do
    reverse(arr,0,n-1);
    reverse(arr,0,k-1); //
    reverse(arr,k,n-1);

}

/*

    for(int t=1;t<=k;t++){

        int last=arr[n-1];
        for(int i=n-1;i>=1;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        
    }
*/