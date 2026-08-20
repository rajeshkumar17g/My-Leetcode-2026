class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0,n=arr.length;
        for(int i=0;i<k;i++)
            sum=sum+arr[i];

        int count=0;
        if(sum/k>=threshold)
            count++;
        
        for(int i=1;i<=n-k;i++){
            sum=sum-arr[i-1]+arr[i+k-1];
            int avg=sum/k;
            if(avg>=threshold)
                count++;
        }
        
        return count;
    }
}