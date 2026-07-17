# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def verticalTraversal(self, root: Optional[TreeNode]) -> List[List[int]]:
        def dfs(root,row,col):
            if(root==None):
                return
            res.append([col,row,root.val])
            dfs(root.left,row+1,col-1)
            dfs(root.right,row+1,col+1)
        #--------------------------------------------
        res=[]
        dfs(root,0,0)
        
        res.sort()

        ans=[]
        prev_col=None
        for arr in res:  # arr[0]=col  arr[1]=row  # arr[2]=val
            if  prev_col==None or prev_col!=arr[0]:
                ans.append([])
            ans[-1].append(arr[2])
            prev_col=arr[0]
        return ans
