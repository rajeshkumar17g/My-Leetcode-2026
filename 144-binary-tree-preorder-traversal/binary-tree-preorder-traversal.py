class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        
        def traversal(root):
            #other approach
            if root!=None:
                res.append(root.val)
                traversal(root.left)
                traversal(root.right)
        #------------------------------------
        res=[]
        traversal(root)
        return res