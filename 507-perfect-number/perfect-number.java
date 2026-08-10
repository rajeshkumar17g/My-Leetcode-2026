class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1){
            return false;
        }
        int factors=1;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                factors=factors+i+num/i;
            }
        }
        return factors==num;
    }
}