class Solution:
    def connect(self, root):
        if not root or not root.left:
            return root
        
        # connect siblings
        root.left.next = root.right
        
        # connect across parents
        if root.next:
            root.right.next = root.next.left
        
        self.connect(root.left)
        self.connect(root.right)
        
        return root