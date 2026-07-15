# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        if root==None:
            return []

        q=deque([root])
        res=[]
        max_level=1
        max_sum=root.val
        l=1
        while q:
            level=[]
            for _ in range(len(q)):
                node=q.popleft()
                level.append(node.val)

                if node.left!=None:
                    q.append(node.left)
                if node.right!=None:
                    q.append(node.right)
            if(sum(level)>max_sum):
                max_sum=sum(level)
                max_level=l
            l=l+1
        return max_level