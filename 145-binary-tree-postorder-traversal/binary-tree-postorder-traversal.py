class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []

        result = []
        stack = [root]

        while stack:
            current = stack.pop()
            result.append(current.val)

            if current.left:
                stack.append(current.left)
            if current.right:
                stack.append(current.right)

        return result[::-1]
        """def traversal(root):
            if root==None:
                return
            
            traversal(root.left)
            traversal(root.right)
            res.append(root.val)
        #---------------------------
        res=[]
        traversal(root)
        return res"""