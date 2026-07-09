class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> subset=new ArrayList<>();
        backtracking(nums,0,0,target,subset,res);
        return res;
    }
    private void backtracking(int[] nums,int i,int sum,int target, ArrayList<Integer> subset, List<List<Integer>>  res){
        if(sum==target){
            res.add(new ArrayList<>(subset));
            return;
        }
        if(sum>target){
            return;
        }
        for(int j=i;j<nums.length;j++){
            subset.add(nums[j]); // making a choice
            backtracking(nums,j,sum+nums[j],target,subset,res);
            subset.remove(subset.size()-1);
        }



    }
}