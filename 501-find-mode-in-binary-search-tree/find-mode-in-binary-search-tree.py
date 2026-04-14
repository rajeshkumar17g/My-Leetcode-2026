class Solution:
    def findMode(self, root):
        self.prev = None
        self.count = 0
        self.maxCnt = 0
        self.ans = []

        def inorder(node):
            if not node:
                return

            inorder(node.left)

            if node.val == self.prev:
                self.count += 1
            else:
                self.count = 1

            if self.count > self.maxCnt:
                self.maxCnt = self.count
                self.ans = [node.val]
            elif self.count == self.maxCnt:
                self.ans.append(node.val)

            self.prev = node.val

            inorder(node.right)

        inorder(root)
        return self.ans