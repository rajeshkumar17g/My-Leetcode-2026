# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
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
            res.append(level[-1])
        return res'''
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:


        def traversal(root,depth):
            if root==None:
                return

            if depth==len(res):
                res.append(root.val)
                
            traversal(root.right,depth+1)
            traversal(root.left,depth+1)
        #----------------------------------------
        res=[]
        traversal(root,0)
        return res