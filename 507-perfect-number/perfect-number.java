class Solution {
    public boolean checkPerfectNumber(int num) {
        
        int sum=0;
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
               sum=sum+i+num/i;
               System.out.print(" "+i+' '+num/i+" ");
            }
        }

        if(Math.sqrt(num)*Math.sqrt(num)==num){
            sum=sum-(int)Math.sqrt(num);
        }

        return (sum-num)==num;
    }
}
/*

1. gen 1 to n 
2. if i can divide the org => factor
3. cal sum of all factors

*/