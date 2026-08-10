class Solution {
    public boolean checkPerfectNumber(int num) {
        int factors=0;
        for(int i=1;i<(num/2)+1;i++){
            if(num%i==0){
                factors+=i;
            }
        }
        return factors==num;
    }
}