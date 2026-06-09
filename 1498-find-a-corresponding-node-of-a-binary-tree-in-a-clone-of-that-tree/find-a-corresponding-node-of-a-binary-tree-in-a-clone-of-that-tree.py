# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:

        def traversal(root):
            if root==None:
                return
            if root.val==target.val:
                return root
            left=traversal(root.left)
            right=traversal(root.right)
            if left!=None:
                return left
            else:
                return right
        #----------------------------
        return traversal(cloned)