class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        backtracking(nums,0,subset,res);
        return res;
    }
    private void backtracking(int[] nums,int i,  List<Integer> subset,  List<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        backtracking(nums,i+1,subset,res);
        subset.remove(subset.size()-1); 
        backtracking(nums,i+1,subset,res);
    }
}