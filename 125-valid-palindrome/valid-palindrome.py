class Solution:
    def isPalindrome(self, s: str) -> bool:
        lower=""
        for ch in s:
            if ch>='A' and ch<='Z':
                lower=lower+chr(ord(ch)+32)
            elif((ch>='a' and ch<='z') or (ch>='0' and ch<='9')):
                lower=lower+ch
        left=0
        right=len(lower)-1
        while(left<=right):
            if lower[left]!=lower[right]:
                return False
            left+=1
            right-=1
        return True

        '''
        s=s.lower()
        res=""
        for ch in s:
            if(ch.isalnum()==True):
                res=res+ch
        return res==res[::-1]'''
            

