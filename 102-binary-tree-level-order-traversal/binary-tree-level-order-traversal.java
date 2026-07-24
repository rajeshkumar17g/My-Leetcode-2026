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