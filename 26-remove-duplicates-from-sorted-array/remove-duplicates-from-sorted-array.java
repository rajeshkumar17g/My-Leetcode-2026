class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i+1;


    }
}