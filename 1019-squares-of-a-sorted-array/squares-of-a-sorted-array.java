class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0,right=nums.length-1;
        int[] res=new int[nums.length];
        int i=right;

        while(left<=right){
            int ls=nums[left]*nums[left];
            int rs=nums[right]*nums[right];

            if(rs>=ls){
                res[i]=rs;
                right--;
            }
            else{
                res[i]=ls;
                left++;
            }
            i--;
        }

        return res;

    }
}