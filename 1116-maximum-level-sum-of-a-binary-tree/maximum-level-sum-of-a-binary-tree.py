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
        #FIFO
        q=deque([root]) # q=[root]. # deque array. .append(). .popleft()
        res=[]

        while q: # while q is not empty 
            level=[]
            for _ in range(len(q)):
                node=q.popleft()
                level.append(node.val)
                if node.left!=None:
                    q.append(node.left)
                if node.right!=None:
                    q.append(node.right)
            res.append(sum(level))
        max=res[0] # assuming root level 1 is max
        max_level=0
        for index in range(len(res)):
            if res[index]>max:
                max=res[index]
                max_level=index

        return max_level+1