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
    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> res=new ArrayList<>();
     traversal(root,res,0);
     return res;
    }
    private void traversal(TreeNode root, List<List<Integer>> res,int depth){
        if(root==null){
            return;
        }
        if(res.size()==depth){
            res.add(new ArrayList<>());
        }
        res.get(depth).add(root.val);
        traversal(root.left,res,depth+1);
        traversal(root.right,res,depth+1);

    }
}


/*


 List<List<Integer>> res = new ArrayList<>();

        List<TreeNode> Q=new ArrayList<>();
        if(root==null){
            return res;
        }
        Q.add(root);
        while(Q.size()!=0){
            List<Integer> level=new ArrayList<>();
            int curr_size=Q.size();

            for(int i=1;i<=curr_size;i++){
                    TreeNode node=Q.remove(0);
                    level.add(node.val);
                    if (node.left!=null){
                        Q.add(node.left);
                    }
                    if(node.right!=null){
                        Q.add(node.right);
                    }
            }
            res.add(level);
        }
        return res;
     */










