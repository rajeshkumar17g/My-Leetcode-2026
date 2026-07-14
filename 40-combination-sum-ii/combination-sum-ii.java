class Solution {
     private void backtracking( List<List<Integer>> res, List<Integer> subset, int i,int sum,int[] candidates,int target){
        if(sum==target){
            res.add(new ArrayList<>(subset));
            return;
        }
        if(sum>target){
            return;
        }
        HashSet<Integer> seen=new HashSet<>();
        for(int j=i;j<candidates.length;j++){
            if(seen.contains(candidates[j])==true){
                continue;
            }
            seen.add(candidates[j]);
            subset.add(candidates[j]);
            backtracking(res,subset,j+1,sum+candidates[j],candidates,target);
            subset.remove(subset.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(res,subset,0,0,candidates,target);
        return res;


    }
}