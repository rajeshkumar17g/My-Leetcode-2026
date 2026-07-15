# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        def dfs(root,depth):
            if(root==None):
                return None
            if(depth==len(res)):
                res.append(root.val)
            dfs(root.right,depth+1)
            dfs(root.left,depth+1)
        res=[]
        dfs(root,0)
        return res



        '''
        if root==None:
            return []

        q=deque([root])
        res=[]

        while q:
            level=[]
            for _ in range(len(q)):
                node=q.popleft()
                level.append(node.val)

                if node.left!=None:
                    q.append(node.left)
                if node.right!=None:
                    q.append(node.right)
            res.append(level[-1])
        return res'''