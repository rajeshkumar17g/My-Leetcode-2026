class Solution {
    public void dfs(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        dfs(root.left,res);
        res.add(root.val);
        dfs(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        dfs(root,res);
        return res;
    }
}