class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        if root==None:
            return 0
        left=self.minDepth(root.left)
        right=self.minDepth(root.right)
        if root.left==None or root.right==None:
            return max(left,right)+1
        return min(left,right)+1