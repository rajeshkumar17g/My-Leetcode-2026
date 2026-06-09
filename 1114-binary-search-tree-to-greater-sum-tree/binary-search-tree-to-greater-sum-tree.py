# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def bstToGst(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        self.sum=0
        def traversal(root):
            if root==None:
                return 

            traversal(root.right)
            self.sum=self.sum+root.val
            root.val=self.sum
            traversal(root.left)
        #----------------------------------
        traversal(root)
        return root