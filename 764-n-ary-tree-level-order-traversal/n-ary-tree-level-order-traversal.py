class Solution:
    def levelOrder(self, root: 'Node') -> List[List[int]]:
        if root==None:
            return []
        
        res=[]
        q=deque([root])

        while q:
            level=[]
            for _ in range(len(q)):
                node=q.popleft()
                level.append(node.val)
                for child in node.children: #[10,20,30,40]
                    q.append(child)
            res.append(level)
        return res

