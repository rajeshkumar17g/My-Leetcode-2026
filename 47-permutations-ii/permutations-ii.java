class Solution {
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void backtracking(int i,int[] nums, List<List<Integer>> res){
        if(i==nums.length){
            ArrayList<Integer> copy=new ArrayList<>();
            for(int ele: nums){
                copy.add(ele);
            }
            res.add(copy);// adding a copy to res
            return;
        }
        HashSet<Integer> seen=new HashSet<>();
        for(int j=i;j<nums.length;j++){
            if(seen.contains(nums[j])==true){
                continue;
            }
            seen.add(nums[j]);
            swap(nums,i,j); //make the move
            backtracking(i+1,nums,res); //backtracking to new level
            swap(nums,i,j); // undo the move
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtracking(0,nums,res);
        return res;
    }
}