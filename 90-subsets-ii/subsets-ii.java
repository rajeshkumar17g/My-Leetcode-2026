class Solution{
public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
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
        while(i<nums.length-1 && nums[i]==nums[i+1]){
            i++;
        }
        backtracking(nums,i+1,subset,res); // exploring a path
    }
}