class Solution {
    public void dfs(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        dfs(root.left,res);
        dfs(root.right,res);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        dfs(root,res);
        return res;
    }
}