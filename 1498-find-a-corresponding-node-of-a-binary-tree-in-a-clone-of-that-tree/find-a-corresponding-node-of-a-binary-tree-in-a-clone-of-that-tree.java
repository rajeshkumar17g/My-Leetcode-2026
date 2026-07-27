/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode dfs(TreeNode root,TreeNode target){
        if(root==null){
            return null;
        }
        if(root.val==target.val){
            return root;
        }
        TreeNode left=dfs(root.left,target);
        TreeNode right=dfs(root.right,target);
        if(left!=null){
            return left;
        }
        return right;
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return dfs(cloned,target);
    }
}