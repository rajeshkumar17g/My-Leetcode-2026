
class Solution {
    public TreeNode searchBST(TreeNode root, int target) {
        if(root==null){
            return root;
        }
        if(target==root.val){
            return root;
        }
        else if(target<root.val){
            return searchBST(root.left,target);
        }
        else{
            return searchBST(root.right,target);
        }
    }
}