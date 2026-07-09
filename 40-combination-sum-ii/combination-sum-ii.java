class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
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
        HashSet<Integer> seen=new HashSet<>();
        for(int j=i;j<nums.length;j++){
            if(seen.contains(nums[j])){
                continue;
            }
            seen.add(nums[j]);
            subset.add(nums[j]); // making a choice
            backtracking(nums,j+1,sum+nums[j],target,subset,res);
            subset.remove(subset.size()-1);
        }
    }
}