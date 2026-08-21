class Solution {
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void backtracking(List<List<Integer>> res,int[] nums,int i){
        if(i==nums.length){
            List<Integer> ans=new ArrayList<>();
            for(int ele: nums){
                ans.add(ele);
            }
            res.add(ans);
            return;
        }

        HashSet<Integer> set=new HashSet<>();     
        for(int j=i;j<nums.length;j++){ // i=0 j=0,1,2 // i=1  j=1,2 //i=2 j=2
            if(set.contains(nums[j])==true){
                continue;
            }
            set.add(nums[j]);
            swap(nums,i,j);  //make the choice
            backtracking(res,nums,i+1); //backtrack
            swap(nums,i,j);  // undo the move
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtracking(res,nums,0);
        return res;
    }
}