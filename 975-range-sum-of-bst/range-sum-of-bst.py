# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        self.sum=0
        def inorder(root):
            if root==None:
                return 
            inorder(root.left)
            if(root.val>=low and root.val<=high):
                self.sum+=root.val
            inorder(root.right)
        #---------------------------------
        res=[]
        inorder(root)
        return self.sum