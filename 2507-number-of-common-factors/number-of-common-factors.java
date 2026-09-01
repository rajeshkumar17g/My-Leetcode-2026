class Solution {
    public int commonFactors(int a, int b) {
        
        int count=0,n;
        if(a<b){
            n=a;
        }
        else{
            n=b;
        }
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}