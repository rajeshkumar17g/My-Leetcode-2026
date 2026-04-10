class Solution:
    def maxDepth(self, root: 'Node') -> int:
        self.res=0
        def dfs(node,level):
            if not node:
                return
            self.res = max(self.res,level)
            for child in node.children:
                dfs(child,level+1)
        dfs(root,1)
        return self.res