class Solution:
    def isValidSerialization(self, preorder: str) -> bool:
        degree=1
        for ch in preorder.split(','):
            degree=degree-1
            if degree<0:
                return False
            if ch!='#':
                degree=degree+2
        return degree==0
            
