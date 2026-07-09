class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        ArrayList<Integer> subset= new ArrayList<>();
        backtracking(nums,0,subset,res);
        return res;
    }
    private void backtracking(int[] nums, int i, ArrayList<Integer> subset, List<List<Integer>> res){

        
        res.add(new ArrayList<>(subset)); // every state is a solution state
        for(int j=i;j<nums.length;j++){
            subset.add(nums[j]); // pick // make a choice
            backtracking(nums,j+1,subset,res); // backtrack // explore a new path
            subset.remove(subset.size()-1); // not pick // undo the choice
        }
    }










    /*
     public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        ArrayList<Integer> subset= new ArrayList<>();
        backtracking(nums,0,subset,res);
        return res;
    }
    private void backtracking(int[] nums, int i, ArrayList<Integer> subset, List<List<Integer>> res){

        if(i==nums.length){
            res.add(new ArrayList<>(subset));// adding a copy of subset
            return;
        }
        subset.add(nums[i]); // Pick making a choice
        backtracking(nums,i+1,subset,res); // exploring a path
        subset.remove(subset.size()-1);// not picking # undo the choice
        backtracking(nums,i+1,subset,res); // exploring a path
    }*/
}