# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        def dfs(root):
            if root:
                dfs(root.left)
                res.append(root.val)
                dfs(root.right)
        #-------------------------------------------
        res=[]
        dfs(root)
        for index in range(1,len(res)):
            if(res[index-1]>=res[index]):
                return False
        return True