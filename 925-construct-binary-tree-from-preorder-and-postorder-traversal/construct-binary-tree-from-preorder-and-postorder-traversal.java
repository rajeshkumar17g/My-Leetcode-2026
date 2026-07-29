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

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int[] preIndex = {preorder.length - 1};   
        int[] postIndex = {postorder.length - 1};

        return makeTree(preorder, postorder, preIndex, postIndex);
    }

    private TreeNode makeTree(int[] preorder, int[] postorder, int[] preIndex, int[] postIndex) {  
        TreeNode node = new TreeNode(postorder[postIndex[0]--]);
        
        if (node.val != preorder[preIndex[0]]) {
            node.right = makeTree(preorder, postorder, preIndex, postIndex);
        }

        if (node.val != preorder[preIndex[0]]) {
            node.left = makeTree(preorder, postorder, preIndex, postIndex);
        }
        preIndex[0]--;
        return node;
    }
}
