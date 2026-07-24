/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }

 class Solution {
    public void dfs(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        dfs(root.left,res);
        dfs(root.right,res);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        dfs(root,res);
        return res;
    }
}
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }

        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            res.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }

        return res;
    }
}














