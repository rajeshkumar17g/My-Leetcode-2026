class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> subset=new ArrayList<>();
        backtracking(1,n,k,subset,res);
        return res;
    }
    private void backtracking(int i,int n, int k,ArrayList<Integer> subset,List<List<Integer>> res){
        if(subset.size()>k){
            return;
        }
        if(subset.size()==k){
            res.add(new ArrayList<>(subset));
            return;
        }
        for(int j=i;j<=n;j++){
            subset.add(j);// making the choice
            backtracking(j+1,n,k,subset,res);
            subset.remove(subset.size()-1);
        }
    }
}










