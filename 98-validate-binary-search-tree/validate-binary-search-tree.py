class Solution:
    def isValidBST(self, root):
        def inorder(root):
            if root==None:
                return 
            inorder(root.left)
            res.append(root.val)
            inorder(root.right)
        #---------------------------------
        res=[]
        inorder(root)
        for index in range(len(res)-1):
            if res[index+1]-res[index]<=0:
                return False
        return True