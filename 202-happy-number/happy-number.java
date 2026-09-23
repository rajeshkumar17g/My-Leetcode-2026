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
      while(slow!=fast){
        slow=sod(slow);      //1 step
        fast=sod(sod(fast)); // 2 steps
        //System.out.println("SLow: "+slow+" Fast: "+fast);
        if(slow==1 || fast==1){
            return true;
        }
      }
      return false;
    

    }
}

/*

 HashSet<Integer> seen=new HashSet<>();

        while(true){

            int sum=0;
            while(n!=0){
                int dig=n%10;
                sum=sum+dig*dig;
                n=n/10;
                
            }
            if(sum==1){
                return true;  
            }
            if(seen.contains(sum)==true){
                return false;
            }
            seen.add(sum);
            n=sum;
        }

*/