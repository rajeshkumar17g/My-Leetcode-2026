# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def distanceK(self, root: TreeNode, target: TreeNode, k: int) -> List[int]:

        ans = []

        def down(node,dist):
            if not node:
                return
            if dist == k:
                ans.append(node.val)
                return
            down(node.left,dist+1)
            down(node.right,dist+1)
        
        def dfs(node):
            if not node:
                return -1

            if node == target:
                down(node,0)
                return 1

            l = dfs(node.left)
            r = dfs(node.right)

            if l != -1:
                if l == k:
                    ans.append(node.val)
                else:
                    down(node.right,l+1)
                
                return l + 1

            if r != -1:
                if r == k:
                    ans.append(node.val)
                else:
                    down(node.left,r+1)
                
                return r + 1

            return -1

        dfs(root)

        return ans