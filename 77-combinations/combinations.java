class Solution {
    private void backtracking(int i,int n,int k,List<Integer> subset, List<List<Integer>> res){
        if(subset.size()>k){
            return;
        }
        if(k==subset.size()){
            res.add(new ArrayList<>(subset));
        }
        for(int j=i;j<=n;j++){
            subset.add(j);
            backtracking(j+1,n,k,subset,res);
            subset.remove(subset.size()-1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();

        backtracking(1,n,k,subset,res);

        return res;
    }
}