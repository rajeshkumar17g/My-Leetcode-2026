# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root==None:
            return []

        q=deque([root])
        res=[]
        toggle=False
        while q:
            level=[]
            for _ in range(len(q)):
                node=q.popleft()
                level.append(node.val)

                if node.left!=None:
                    q.append(node.left)
                if node.right!=None:
                    q.append(node.right)
            if toggle==True:
                level.reverse()
            res.append(level)
            toggle=not toggle
                
        return res