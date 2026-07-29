
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
          if(p==root || q==root || root==null){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
         TreeNode right=lowestCommonAncestor(root.right,p,q);
         if(left!=null && right!=null){
            return root;
         }
         if(left==null){
            return right;
         }
         return left;
    }
}