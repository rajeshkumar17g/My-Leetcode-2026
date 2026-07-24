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
 */

class Solution {
    public void dfs(List<Integer>  res,TreeNode root,int depth){
        if(root==null){
            return;
        }
        if(res.size()==depth){
           res.add(root.val);
        }
        dfs(res,root.right,depth+1);
        dfs(res,root.left,depth+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>  res=new ArrayList<>();
        dfs(res,root,0);
        return res;
    }
}