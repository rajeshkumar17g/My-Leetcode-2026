# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findSecondMinimumValue(self, root: Optional[TreeNode]) -> int:
        ans = float('inf') 
        def helper(node): 
            if node is None: 
                return 
            if node.val > root.val:
                nonlocal ans 
                ans = min(ans, node.val)
            helper(node.left) 
            helper(node.right) 
        helper(root)
        return ans if ans < float('inf') else -1 