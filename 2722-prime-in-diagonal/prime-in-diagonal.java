class Solution {

    public boolean isPrime(int n){
        if(n==1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
            return true;
    }

    public int diagonalPrime(int[][] nums) {
        int n=nums.length;

        int max_prime=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    if(isPrime(nums[i][j])==true){
                        if(nums[i][j]>max_prime){
                            max_prime=nums[i][j];
                        }
                    }
                }
            }
        }

        return max_prime;
    }
}