class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtracking(nums,0,res);
        return res;
    }
    private void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void backtracking(int[] nums, int i, List<List<Integer>> res){
        if(i==nums.length){
            ArrayList<Integer> sol=new ArrayList<>();
           for(int k=0;k<nums.length;k++){
            sol.add(nums[k]);
           }
            res.add(sol);// solution state adda deepcopy
            return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j); // make a choice # swap
            backtracking(nums,i+1,res);//explore this path
            swap(nums,i,j);// undo the choice # unswap
        }
    }
}