
class Solution:
    def connect(self, root: 'Node') -> 'Node':
        if(root==None):
            return root
        q=deque([root])
        while q:
            level=[]
            n=len(q)
            for _ in range(n):
                 node=q.popleft()
                 level.append(node)
                 if node.left:
                    q.append(node.left)
                 if node.right:
                    q.append(node.right)
            for index in range(len(level)-1):
                level[index].next=level[index+1]
        return root
            
                 
