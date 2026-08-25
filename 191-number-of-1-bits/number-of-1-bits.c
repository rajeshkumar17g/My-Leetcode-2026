int hammingWeight(int n) {
    int count=0;
    while(n!=0){
        int bit=n%2;
        if(bit==1){
            count++;
        }
        n=n/2;
    }

    return count;
}