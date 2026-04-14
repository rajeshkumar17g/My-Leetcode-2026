class Solution:
    def isValidBST(self, root):
        self.prev = float('-inf')
        
        def inorder(node):
            if not node:
                return True
            
            if not inorder(node.left):
                return False
            
            if node.val <= self.prev:
                return False
            
            self.prev = node.val
            
            return inorder(node.right)
        
        return inorder(root)