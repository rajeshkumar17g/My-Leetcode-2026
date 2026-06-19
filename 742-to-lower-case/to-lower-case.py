class Solution:
    def toLowerCase(self, s: str) -> str:
        res=''
        for ch in s:
            if ord(ch)>=65 and ord(ch)<=90:
                res=res+chr(ord(ch)+32)
            else:
                res=res+ch
        return res
        '''return s.lower()'''

        