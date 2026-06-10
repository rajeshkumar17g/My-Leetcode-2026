# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:

        def traversal(root):
            if root==None:
                return
            traversal(root.left)
            res.append(root.val)
            traversal(root.right)
        #--------------------------
        res=[]
        traversal(root)
        return res==sorted(res) and len(res)==len(set(res))
        