class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        
       stack=[]
       res=[]

       while root!=None or stack!=[]:
            while root!=None: # keep moving left until it becomes none
                res.append(root.val)  # access the val
                stack.append(root) #save address of last visited node
                root=root.left #move left until left is none. # then move left
            
            root=stack.pop() # last visited node LIFO
            root=root.right  # now val done and left is done # move right
        
       return res