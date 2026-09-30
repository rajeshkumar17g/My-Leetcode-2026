class Solution {

    public void rev(int[] nums,int left,int right){

        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }
    }



    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        rev(nums,0,n-1);
         rev(nums,0,k-1);
         rev(nums,k,n-1);
    }
}


/*


  int n=nums.length;
        k=k%n;
        
        for(int j=1;j<=k;j++){

            int temp=nums[n-1];
            for(int i=n-1;i>=1;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=temp;

        }

*/