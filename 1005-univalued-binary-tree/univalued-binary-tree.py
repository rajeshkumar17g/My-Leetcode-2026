class Solution:
    def isUnivalTree(self, root: Optional[TreeNode]) -> bool:

        if root==None:
            return True
        elif root.left!=None and root.val!=root.left.val:
            return False
        elif root.right!=None and root.val!=root.right.val:
            return False
        return self.isUnivalTree(root.left) and self.isUnivalTree(root.right)


        '''

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
        '''