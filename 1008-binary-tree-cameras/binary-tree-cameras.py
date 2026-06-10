# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minCameraCover(self, root: Optional[TreeNode]) -> int:
        self.count=0
        def traversal(root):
            if root==None:
                return
            if root.left==None and root.right==None:
                return 'leaf'
            left=traversal(root.left)
            right=traversal(root.right)

            if left=='leaf' or right=='leaf':
                self.count+=1
                return 'camera'
            if left=='camera' or right=='camera':
                return 'gap'
            if left=='gap' or right=='gap':
                return 'leaf'
        #---------------------------------
        if traversal(root)=='leaf':
            self.count+=1
        return self.count