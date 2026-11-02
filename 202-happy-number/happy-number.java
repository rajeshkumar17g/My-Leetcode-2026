class Solution {
    public int sod(int n){

        int sum=0;
        while(n!=0){
            int dig=n%10;

            sum=sum+dig*dig;
            n=n/10;
        }

        return sum;
    }
    public boolean isHappy(int n) {
        
        int slow=n;
        int fast=sod(sod(n));
        if(slow==1 || fast==1){
            return true;
        }

        while(slow!=fast){
            slow=sod(slow);
            fast=sod(sod(fast));
            if(slow==1 || fast==1){
                return true;
            }
        }
        return false;
    }
}