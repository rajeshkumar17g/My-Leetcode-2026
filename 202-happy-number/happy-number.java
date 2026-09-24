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
        if(n==1){
            return true;
        }
        int slow=n;
        int fast=sod(n);
        
        while(fast!=slow){
            slow=sod(slow);
            fast=sod(sod(fast));
             System.out.println("Slow: "+slow+" fast: "+fast);

            if(slow==1 || fast==1){
                return true;
            }
           
        }
        return false;
    }
}