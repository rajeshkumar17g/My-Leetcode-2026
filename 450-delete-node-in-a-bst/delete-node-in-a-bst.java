
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }

            TreeNode crr=root.right;
            while (crr.left!=null){
                crr=crr.left;
            }

            root.val=crr.val;
            root.right=deleteNode(root.right,crr.val);

        }
        return root;
    }
}