class Solution {
    public boolean checkPerfectNumber(int num) {
        
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                 sum=sum+i;
            }
        }

        return sum==num;
    }
}
/*

1. gen 1 to n 
2. if i can divide the org => factor
3. cal sum of all factors

*/