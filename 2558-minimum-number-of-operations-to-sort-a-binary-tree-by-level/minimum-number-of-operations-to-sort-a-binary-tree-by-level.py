# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minimumOperations(self, root: Optional[TreeNode]) -> int:
        def swaps(arr):
                        if len(arr)==1: return 0
                        new=sorted(arr)
                        hs={}
                        for i in range(len(arr)):
                            hs[arr[i]]=i
                        swaps=0
                        for i in range(len(arr)):
                            if arr[i]!=new[i]:
                                swaps+=1
                                idx=hs[new[i]]
                                hs[arr[i]]=idx
                                arr[i],arr[idx]=arr[idx],arr[i]

                        return swaps
        if root==None:
            return []
        
        q=deque([root])
        s=0
        while q:
            level=[]
            for _ in range(len(q)):
                node=q.popleft()
                level.append(node.val)
                if node.left!=None:
                    q.append(node.left)
                if node.right!=None:
                    q.append(node.right)
            s+=swaps(level)
        return s

