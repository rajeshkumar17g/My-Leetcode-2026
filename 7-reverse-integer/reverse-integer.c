int reverse(int x){

    long rev=0;
    while(x!=0){
        int dig=x%10;
        rev=rev*10+dig;
        x=x/10;
    }
    if(rev>=-pow(2,31) && rev<=pow(2,31)-1)
        return rev;
    else
        return 0;
}