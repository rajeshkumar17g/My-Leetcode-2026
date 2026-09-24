class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] ans=new int[nums.length];

        int k=nums.length-1;
        int left=0,right=nums.length-1;

        while(left<=right){
            int ls=nums[left]*nums[left];
            int rs=nums[right]*nums[right];

            if(ls>rs){
                ans[k]=ls;
                k--;
                left++;
            }
            else{
                ans[k]=rs;
                k--;
                right--;
            }

        }

        return ans;

    }
}