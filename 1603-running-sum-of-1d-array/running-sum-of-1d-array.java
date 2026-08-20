class Solution {
    public static void func(int[] nums,int index){
        if(index==nums.length){
            return;
        }
        nums[index]=nums[index]+nums[index-1];
        func(nums,index+1);
    }
    public int[] runningSum(int[] nums) {
        func(nums,1);
        return nums;
    }
}