class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        if root==None:
            return []
        
        res=[]
        q=deque([root])
        max_sum=root.val
        max_level=1
        l=1
        while q:
            sum=0
            for _ in range(len(q)):
                node=q.popleft()
                sum=sum+node.val
                if node.left!=None:
                    q.append(node.left)
                if node.right!=None:
                    q.append(node.right)
            if sum>max_sum:
                max_sum=sum
                max_level=l
            l=l+1

        return max_level