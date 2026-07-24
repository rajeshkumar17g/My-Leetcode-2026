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
 class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
         Queue<TreeNode> q=new LinkedList<>();
         q.offer(root);
         while(!q.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                level.add(node.val);

                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            res.add(level);
         }
         return res;
    }
}
 */
class Solution {
    public void dfs(  List<List<Integer>>  res,TreeNode root,int depth){
        if(root==null){
            return;
        }
        if(res.size()==depth){
            res.add(new ArrayList<>());
        }
        res.get(depth).add(root.val);
        dfs(res,root.left,depth+1);
        dfs(res,root.right,depth+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>  res=new ArrayList<>();
        dfs(res,root,0);
        return res;
    }
}





















