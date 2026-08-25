int sumOfTheDigitsOfHarshadNumber(int x) {
    int sum=0;
    int dup=x;
    while(x!=0){
        int dig=x%10;
        sum=sum+dig;
        x=x/10;
    }
   
    if(dup%sum==0){
        return sum;
    }

    return -1;
}
/*
0. sep digits
1. sum of digits
2. 

*/