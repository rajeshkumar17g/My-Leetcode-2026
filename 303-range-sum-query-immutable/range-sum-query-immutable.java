class NumArray {

    int[] prefix_sum;    
    public NumArray(int[] nums) {
        prefix_sum=new int[nums.length];

        prefix_sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix_sum[i]=prefix_sum[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return prefix_sum[right];
        }
        return prefix_sum[right]-prefix_sum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */