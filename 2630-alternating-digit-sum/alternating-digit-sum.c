int alternateDigitSum(int n) {
    int count=1;
    int esum=0,osum=0;
    while(n!=0){
        int dig=n%10;
        if(count%2==0){
            esum=esum+dig;
        }
        else{
            osum=osum+dig;
        }
        n=n/10;
        count++;
    }
    if(count%2==0){
        return osum-esum;
    }
    else
    {
        return esum-osum;
    }
}