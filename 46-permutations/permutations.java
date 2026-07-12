class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtracking(nums,0,res);
        return res;
    }
    private void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void backtracking(int[] nums,int i,  List<List<Integer>> res){
        if(i==nums.length){
            List<Integer> copy=new ArrayList<>();
            for(int ele: nums){
                copy.add(ele);
            }
            res.add(copy);
            return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            backtracking(nums,i+1,res);
            swap(nums,i,j);
        }
    }
}