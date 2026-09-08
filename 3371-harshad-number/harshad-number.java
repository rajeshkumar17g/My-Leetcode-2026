class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        
        int dup=x;
        int sum=0;
        while(x!=0){
            int dig=x%10;
            sum=sum+dig;
            x=x/10;
        }

        if(dup%sum==0){
            return sum;
        }
        else{
            return -1;
        }
    }
}