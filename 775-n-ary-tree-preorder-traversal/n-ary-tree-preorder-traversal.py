
class Solution:
    def preorder(self, root: 'Node') -> List[int]:
        if not root: return []
        stack = [root]
        res= []
        while len(stack):
            temp = stack.pop()
            res.append(temp.val)
            stack.extend(reversed(temp.children))
        return res
    """
        def traversal(root):
            if root==None:
                return
            
            res.append(root.val)
            for child in root.children: #[10,20,30,40l50]
                traversal(child)
        #---------------------------
        res=[]
        traversal(root)
        return res

        """