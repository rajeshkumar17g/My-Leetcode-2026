
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int target) {
            if(root==null){
                return new TreeNode(target);
            }
            if(target<root.val){
                root.left=insertIntoBST(root.left,target);
            }
            if(target>root.val){
                root.right=insertIntoBST(root.right,target);
            }
            return root;
    }
}