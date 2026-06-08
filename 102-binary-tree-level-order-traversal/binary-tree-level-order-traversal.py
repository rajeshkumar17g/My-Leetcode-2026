from collections import deque
'''
        if root==None:
            return []
            
        res=[]
        q=deque([root]) # q=[None]

        while q: 
            level=[]
            for _ in range(len(q)):
                node=q.popleft()
                level.append(node.val)
                if node.left!=None:
                    q.append(node.left)
                if node.right!=None:
                    q.append(node.right)
            res.append(level)
        return res
'''


class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        def traversal(root,depth):
            if root==None:
                return

            if depth==len(res):
                res.append([])
            res[depth].append(root.val)
            traversal(root.left,depth+1)
            traversal(root.right,depth+1)
        #----------------------------------------
        res=[]
        traversal(root,0)
        return res




























