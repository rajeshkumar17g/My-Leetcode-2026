class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        def dfs(root,depth):
            if root==None: 
                res.append(depth)
                return
            if root.left==None:
                dfs(root.right,depth+1)
            elif root.right==None:
                dfs(root.left,depth+1)
            else:
                dfs(root.left,depth+1)
                dfs(root.right,depth+1)
        #-----------------------
        res=[]
        dfs(root,0)
        return min(res)
