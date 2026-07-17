# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        def dfs(root):
            if(root==None):
                return
            dfs(root.left)
            res.append(root.val)
            dfs(root.right)
        #-----------------------------------
        res=[]
        dfs(root)
        return res==sorted(res) and len(set(res))==len(res)