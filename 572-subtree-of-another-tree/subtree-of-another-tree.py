class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if p==None and q==None: # base case
            return True
        if p==None or q==None or p.val!=q.val: #base case
            return False
        return self.isSameTree(p.left,q.left) and self.isSameTree(p.right,q.right) #recursive

    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if root==None:
            return False
        if self.isSameTree(root,subRoot):
            return True
        return self.isSubtree(root.left,subRoot) or self.isSubtree(root.right,subRoot)