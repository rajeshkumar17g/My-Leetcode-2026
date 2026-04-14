# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.count=0
        def inorder(root):
            if root==None:
                return 
            left=inorder(root.left)
            self.count+=1
            if k==self.count:
                return root.val
            right=inorder(root.right)
            return left if left!=None else right
        #---------------------------------
        res=[]
        return inorder(root)