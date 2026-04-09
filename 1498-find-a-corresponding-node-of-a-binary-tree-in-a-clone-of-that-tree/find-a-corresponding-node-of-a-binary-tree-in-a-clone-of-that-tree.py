class Solution:
    def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:

        def traversal(root):
            if root==None:
                return
            if(root.val==target.val):
                return root # reference
            left=traversal(root.left) 
            right=traversal(root.right)
            if left!=None:
                return left
            return right
        #--------------------
        return traversal(cloned)