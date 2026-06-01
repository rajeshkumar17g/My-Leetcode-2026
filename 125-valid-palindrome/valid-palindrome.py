class Solution:
    def isPalindrome(self, s: str) -> bool:
        res=''
        for ch in s:
            if ch>='A' and ch<='Z':
               res=res+ chr(ord(ch)+32)
            else:
                res=res+ch
        ans=''
        for ch in res:
            if ch>='A' and ch<='Z' or ch>='a' and ch<='z' or ch>='0' and ch<='9':
                ans=ans+ch
        
        return ans==ans[::-1]
