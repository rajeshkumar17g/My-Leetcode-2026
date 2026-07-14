class Solution {
    private void backtracking( List<List<Integer>> res, List<Integer> subset, int i,int sum,int[] candidates,int target){
        if(sum==target){
            res.add(new ArrayList<>(subset));
            return;
        }
        if(sum>target){
            return;
        }

        for(int j=i;j<candidates.length;j++){
            subset.add(candidates[j]);
            backtracking(res,subset,j,sum+candidates[j],candidates,target);
            subset.remove(subset.size()-1);
        }


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();

        backtracking(res,subset,0,0,candidates,target);
        return res;


    }
}