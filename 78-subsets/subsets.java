class Solution {
    public void backtracking(int[] nums,List<List<Integer>> res, List<Integer> subset,int i){
        res.add(new ArrayList<>(subset));
        for(int j=i;j<nums.length;j++){
            subset.add(nums[j]);
            backtracking(nums,res,subset,j+1);
            subset.remove(subset.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        backtracking(nums,res,subset,0); // subset=[]  i=0
        return res;
    }
}
/*

class Solution {
    public void backtracking(int[] nums,List<List<Integer>> res, List<Integer> subset,int i){
        if(i==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        backtracking(nums,res,subset,i+1);//[] -> [a] -> [a,b] -> [a,b]
        subset.remove(subset.size()-1);
        backtracking(nums,res,subset,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        backtracking(nums,res,subset,0); // subset=[]  i=0
        return res;
    }
}
*/