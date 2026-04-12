class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def __init__(self):
        self.ans = []

    def make_tree(self, root):
        if root is None:
            return (True, 0)

        l = self.make_tree(root.left)
        r = self.make_tree(root.right)

        if l[0] and r[0] and l[1] == r[1]:
            s = l[1] + r[1] + 1
            self.ans.append(s)
            return (True, s)

        return (False, 0)

    def kthLargestPerfectSubtree(self, root, k):
        if root is None:
            return -1

        self.ans.clear()
        self.make_tree(root)

        self.ans.sort(reverse=True)

        if len(self.ans) >= k:
            return self.ans[k - 1]
        return -1