int largestAltitude(int* gain, int n) {
    
    int max=0;
    if(gain[0]>=0){
        max=gain[0];
    }
    for(int i=1;i<n;i++){
        gain[i]=gain[i-1]+gain[i];
        if(gain[i]>max){
            max=gain[i];
        }
    }
    return max;
}