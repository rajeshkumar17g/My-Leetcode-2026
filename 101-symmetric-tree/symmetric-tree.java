
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left,root.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null || p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.right) && isSameTree(p.right,q.left);
    }
}