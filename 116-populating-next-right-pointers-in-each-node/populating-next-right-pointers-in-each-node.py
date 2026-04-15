"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""
"""
def dfs(root):
            if not root:
                return
            if root.left:
                root.left.next=root.right
            if root.right and root.next:
                root.right.next=root.next.left

            dfs(root.left)
            dfs(root.right)
        #---------------
        dfs(root)
        return root
"""
class Solution:
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
        if root==None:
            return root
        
        q=deque([root])
        while q:
            level=[]
            for _ in range(len(q)):
                node=q.popleft()
                level.append(node)
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            
            for index in range(len(level)-1):
                level[index].next=level[index+1]
            
        return root
            
        