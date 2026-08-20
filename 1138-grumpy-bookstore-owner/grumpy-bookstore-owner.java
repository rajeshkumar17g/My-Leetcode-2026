class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) {
        
    int count=0;
    int n=customers.length;


    for(int i=0;i<n;i++){
        if(grumpy[i]==0){
            count=count+customers[i];
        }
    }

    int wsum=0;
    for(int i=0;i<k;i++){
        if(grumpy[i]==1){
            wsum=wsum+customers[i];
        }
    }

    int max=wsum;

    for(int i=1;i<=n-k;i++){
        if(grumpy[i-1]==1){
            wsum=wsum-customers[i-1];
        }
        if(grumpy[i+k-1]==1){
            wsum=wsum+customers[i+k-1];
        }
        max=Math.max(max,wsum);
    }
    return count+max;
    }
}

/*
1. satisfied ust count
2. 1st minutes window sum==>  grumpy[i]==1
3. compare it all other windows => max window sum
4. return count+max_window



*/