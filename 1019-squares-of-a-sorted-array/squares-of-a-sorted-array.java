class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] res=new int[nums.length];

        int i=nums.length-1;

        int left=0,right=nums.length-1;

        while(left<=right){
            int ls=nums[left]*nums[left];
            int rs=nums[right]*nums[right];

            if(ls>rs){
                res[i]=ls;
                left++;
            }
            else{
                res[i]=rs;
                right--;
            }
            i--;
        }

        return res;
    }
}