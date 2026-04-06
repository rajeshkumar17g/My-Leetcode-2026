class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        def traversal(root,res,depth):
            if root:
                if len(res)==depth:
                    res.append([])
                res[depth].append(root.val)
                traversal(root.left,res,depth+1)
                traversal(root.right,res,depth+1)
        #-------------------------------------------
        
        res=[]
        traversal(root,res,0) # depth starts from depth=0
        return res

"""class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        def traversal(root,res,depth):
            if root:
                if len(res)==depth:
                    res.append([])
                res[depth].append(root.val)
                traversal(root.left,res,depth+1)
                traversal(root.right,res,depth+1)
        #-------------------------------------------
        res=[]
        traversal(root,res,0) # depth starts from depth=0
        return res


        class Solution:
    def traversal(self,root,res,depth):
            if root:
                if len(res)==depth:
                    res.append([])
                res[depth].append(root.val)
                self.traversal(root.left,res,depth+1)
                self.traversal(root.right,res,depth+1)
                
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        #-------------------------------------------
        res=[]
        self.traversal(root,res,0) # depth starts from depth=0
        return res


    class Solution:
    def __init__(self):
        self.res=[]
    def levelOrder(self, root: Optional[TreeNode],depth=0) -> List[List[int]]:
        if root:
                if len(self.res)==depth:
                    self.res.append([])
                self.res[depth].append(root.val)
                self.levelOrder(root.left,depth+1)
                self.levelOrder(root.right,depth+1)
        return self.res
"""