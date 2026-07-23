class Solution {
    public void backtracking(int i, List<Integer> subset,int[] nums,List<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]); 
        backtracking(i+1,subset,nums,res);
        subset.remove(subset.size()-1); 
        backtracking(i+1,subset,nums,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset=new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();

        backtracking(0,subset,nums,res);

        return res;

    }
}