class Solution:
    def defangIPaddr(self, address: str) -> str:
        res=""
        for ch in address:
            if ch=='.':
                res=res+'[.]'
            else:
                res=res+ch
        return res
    
        