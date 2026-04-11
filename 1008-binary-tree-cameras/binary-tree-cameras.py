class Solution:
    def minCameraCover(self, root: Optional[TreeNode]) -> int:
        self.count=0
        def dfs(root):
            if root.left==None and root.right==None:
                return "leaf"
            left=None
            right=None
            if root.left!=None:
                left=dfs(root.left)
            if root.right!=None:
                right=dfs(root.right)
            
            if left=='leaf' or right=='leaf':
                self.count+=1
                return 'camera'
            if left=="camera" or right=='camera':
                return "gap"
            if left=="gap" or right=="gap":
                return "leaf"
        if dfs(root)=='leaf':
            return self.count+1
        return self.count