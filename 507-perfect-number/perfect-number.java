class Solution {
    public boolean checkPerfectNumber(int num) {
        
        int sum=1;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
               sum=sum+i+num/i;
            }
        }
        if((int)Math.sqrt(num)*(int)Math.sqrt(num)==num){
            sum=sum-(int)Math.sqrt(num);
        }

        return sum==num;
    }
}