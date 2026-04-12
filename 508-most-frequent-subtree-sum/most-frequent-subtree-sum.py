# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findFrequentTreeSum(self, root: Optional[TreeNode]) -> List[int]:

        if not root:
            return []

        freq = defaultdict(int)

        def dfs(node):
            if not node:
                return 0

            left = dfs(node.left)
            right = dfs(node.right)

            total = node.val + left + right
            freq[total] += 1

            return total

        dfs(root)

        max_freq = max(freq.values())

        return [s for s in freq if freq[s] == max_freq]
        