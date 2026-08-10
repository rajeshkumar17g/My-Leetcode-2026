class Solution {
    public boolean checkPerfectNumber(int num) {
        int factors=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                factors+=i;
            }
        }
        return factors==num;
    }
}