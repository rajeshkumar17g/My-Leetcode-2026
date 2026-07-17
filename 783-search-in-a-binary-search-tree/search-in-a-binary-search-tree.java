
class Solution {
    public TreeNode searchBST(TreeNode root, int target) {
        if(root==null || root.val==target){
            return root;
        }
        else if(target<root.val){
            return searchBST(root.left,target);
        }
        return searchBST(root.right,target);
    }
}