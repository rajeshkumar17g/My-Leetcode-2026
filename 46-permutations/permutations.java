class Solution {
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void backtracking(int[] nums,List<List<Integer>> res,int i){
        if(i==nums.length){
            List<Integer> copy=new ArrayList<>();
            for(int ele: nums){
                copy.add(ele);
            }
            res.add(copy);
            return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j); // make the choice
            backtracking(nums,res,i+1); //explore that path
            swap(nums,i,j); // undo the choice
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtracking(nums,res,0);
        return res;
    }
}