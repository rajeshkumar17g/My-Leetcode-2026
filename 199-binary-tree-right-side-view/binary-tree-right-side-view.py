class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
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
            res.append(level[-1])
        
        return res