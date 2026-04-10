"""
# Definition for a Node.
class Node:
    def __init__(self, val: Optional[int] = None, children: Optional[List['Node']] = None):
        self.val = val
        self.children = children
"""

class Solution:
    def levelOrder(self, root: 'Node') -> List[List[int]]:

        if root==None:
            return []

        q=deque([root]) 
        res=[]

        while q: 
            level=[]
            for _ in range(len(q)):
                node=q.popleft()
                level.append(node.val)
                for child in node.children:
                    q.append(child)
            res.append(level)
        
        return res