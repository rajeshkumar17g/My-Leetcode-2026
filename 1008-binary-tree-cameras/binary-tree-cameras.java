
class Solution {
    int count=0;
    public String dfs(TreeNode root){
        if(root==null){
            return "";
        }
        if(root.left==null && root.right==null){
            return "leaf";
        }
        String left=dfs(root.left);
        String right=dfs(root.right);

        if(left.equals("leaf") || right.equals("leaf")){
            count++;
            return "camera";
        }
        if(left.equals("camera") || right.equals("camera")){
            return "gap";
        }
        return "leaf";

    }
    public int minCameraCover(TreeNode root) {
        if(dfs(root).equals("leaf")){
            count++;
        }
        return count;
    }
}