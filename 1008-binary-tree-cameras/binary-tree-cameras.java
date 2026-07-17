
class Solution {
    int count=0;
    public String traversal(TreeNode root){
        if(root==null){
            return "";
        }

        if(root.left==null && root.right==null){
            return "leaf";
        }

        String left=traversal(root.left);
        String right=traversal(root.right);

        if(left.equals("leaf")|| right.equals("leaf")){
            count++;
            return "camera";
        }  
        else if(left.equals("camera")|| right.equals("camera")){
            
            return "gap";
        }  
        return "leaf";

    }
    public int minCameraCover(TreeNode root) {
      
        if(traversal(root).equals("leaf")==true){
            count++;
        }
        return count;
    }
}