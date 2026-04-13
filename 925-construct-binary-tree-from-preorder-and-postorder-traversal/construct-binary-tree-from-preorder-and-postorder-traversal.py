class Solution:
    def constructFromPrePost(self, preorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
        
        def maketree():
            node=TreeNode(postorder.pop())
            if node.val!=preorder[-1]:
                node.right=maketree()
            if node.val!=preorder[-1]:
                node.left=maketree()
            preorder.pop()
            return node
        #----------------------
        return maketree()
