class Solution {
    public boolean isHappy(int n) {
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


    }
}