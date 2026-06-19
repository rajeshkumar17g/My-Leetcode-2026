class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        res=""
        for ch in s:
            if ((ch>='A' and ch<='Z') or 
                (ch>='a' and ch<='z') or 
                (ch>='0' and ch<='9')):
                    res=res+ch
        left=0
        right=len(res)-1
        while left<=right:
            if res[left]!=res[right]:
                return False
            left+=1
            right-=1
        return True







        '''

        s=s.lower()
        res=""
        for ch in s:
            if ch.isalnum():
                res=res+ch
        return res==res[::-1]
        '''