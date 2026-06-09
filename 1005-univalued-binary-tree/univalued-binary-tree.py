class Solution:
    def isUnivalTree(self, root: Optional[TreeNode]) -> bool:

        def traversal(root):
            if root==None:
                return
            res.append(root.val)
            traversal(root.left)
            traversal(root.right)
        #----------------------------
        res=[]
        traversal(root)
        return len(set(res))==1