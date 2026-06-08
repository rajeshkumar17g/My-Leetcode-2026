# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        def inorder(root):
            if root==None:
                return
            inorder(root.left)
            inorder(root.right)
            res.append(root.val)
        #-----------------------------
        res=[]
        inorder(root)
        return res