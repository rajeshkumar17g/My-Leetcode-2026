# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def longestZigZag(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        if not root:
            return 0
        
        self.ans = 0

        def max_zig_zag(node, direction, length):
            if node is None:
                return None

            # Update the global maximum length found so far
            self.ans = max(self.ans, length)

            if direction == "left":
                # To continue ZigZag, must go Right
                max_zig_zag(node.right, "right", length + 1)
                # If we go Left again, ZigZag resets to 1
                max_zig_zag(node.left, "left", 1)

            elif direction == "right":
                # To continue ZigZag, must go Left
                max_zig_zag(node.left, "left", length + 1)
                # If we go Right again, ZigZag resets to 1
                max_zig_zag(node.right, "right", 1)

        # Start the recursion from the root in both directions
        max_zig_zag(root.left, "left", 1)
        max_zig_zag(root.right, "right", 1)

        return self.ans