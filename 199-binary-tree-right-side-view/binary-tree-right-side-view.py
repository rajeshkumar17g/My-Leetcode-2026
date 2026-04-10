class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
       
        def traversal(root,depth):
            if root==None:
                return 0
            if depth==len(res):
                res.append(root.val)
            traversal(root.right,depth+1)
            traversal(root.left,depth+1)
        #-------------------------------
        res=[]
        traversal(root,0)
        return res