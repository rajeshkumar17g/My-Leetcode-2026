
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        backtrack(root,"",res); //path=""
        return res;
    }
    private void backtrack(TreeNode root, String path,List<String> res){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            res.add(path+String.valueOf(root.val));
        }
        backtrack(root.left,path+String.valueOf(root.val)+"->",res);
        backtrack(root.right,path+String.valueOf(root.val)+"->",res);
    }
}