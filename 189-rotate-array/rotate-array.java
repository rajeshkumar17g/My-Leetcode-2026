class Solution {
    public static void reverse(int[] nums,int left,int right){
            while(left<=right){
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
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
     
    }
}

/*

k=k%nums.length;
     for(int i=1;i<=k;i++){
        int last=nums[nums.length-1];
        for(int index=nums.length-1;index>0;index--){
            nums[index]=nums[index-1];
        }   
        nums[0]=last;
     }*/