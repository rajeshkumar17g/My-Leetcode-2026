# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        
        if root==None:
            return None
        if key<root.val:
            root.left=self.deleteNode(root.left,key)
        elif key>root.val:
            root.right=self.deleteNode(root.right,key)
        else:
            if root.left==None and root.right==None:
                return None
            if root.left==None:
                return root.right
            if root.right==None:
                return root.left

            crr=root.right
            while crr.left!=None:
                crr=crr.left
            root.val=crr.val
            root.right=self.deleteNode(root.right,crr.val)
        return root
            
