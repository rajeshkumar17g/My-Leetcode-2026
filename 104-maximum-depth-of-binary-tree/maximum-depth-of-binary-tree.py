class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        def dfs(root,depth):
            if root==None:  # crr_state == solution state
                return depth
            return max(dfs(root.left,depth+1),dfs(root.right,depth+1))
        #-----------------------
        return dfs(root,0)
