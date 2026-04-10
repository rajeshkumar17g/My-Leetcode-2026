# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
        def dfs(root,depth):
            if root==None:
                return
            
            if depth==len(res):
                res.append([])
            
            res[depth].append(root.val)
            dfs(root.left,depth+1)
            dfs(root.right,depth+1)
        #-----------------------------------
        res=[]
        dfs(root,0)
        return res[::-1]