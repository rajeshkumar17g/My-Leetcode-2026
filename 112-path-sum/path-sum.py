
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], target: int) -> bool:
        if root==None:
            return False
        if root.left==None and root.right==None and target-root.val==0:
            return True
        return self.hasPathSum(root.left,target-root.val) or self.hasPathSum(root.right,target-root.val)
