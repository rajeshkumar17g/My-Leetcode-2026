class Solution {
    public void backtracking(int n,List<List<Integer>> res, List<Integer> subset,int i,int k){
        if(subset.size()==k){
                res.add(new ArrayList<>(subset));
        }
        for(int j=i;j<=n;j++){
            subset.add(j);
            backtracking(n,res,subset,j+1,k);
            subset.remove(subset.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k)  {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        backtracking(n,res,subset,1,k); // subset=[]  i=0
        return res;
    }
}