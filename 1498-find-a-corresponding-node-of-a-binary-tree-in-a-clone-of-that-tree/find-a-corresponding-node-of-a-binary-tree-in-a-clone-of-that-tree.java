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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned==null){
            return cloned;
        }
        if(target.val==cloned.val){
            return cloned;
        }
        TreeNode left=getTargetCopy(original,cloned.left,target);
        TreeNode right=getTargetCopy(original,cloned.right,target);
        if(left!=null)
            return left;
        return right;

    }
}