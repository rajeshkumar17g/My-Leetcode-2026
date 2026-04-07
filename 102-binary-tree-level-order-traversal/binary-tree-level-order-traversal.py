class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        
        def dfs(root,depth):
            if root==None:  # crr_state == solution state
                return
            if len(res)==depth: #first time when we reach a level
                res.append([]) # adding a new empty list for that level
            res[depth].append(root.val)
            dfs(root.left,depth+1)
            dfs(root.right,depth+1)
        #-----------------------
        res=[]
        dfs(root,0)
        return res
