class Solution:
    def isPalindrome(self, s: str) -> bool:
        left=0
        right=len(s)-1
        while(left<=right):
            while left<=right and not s[left].isalnum():
                left=left+1

            while right>=left and not s[right].isalnum():
                right=right-1
            
            if left<=right and s[left].lower()!=s[right].lower():
                return False
            
            left=left+1
            right=right-1

        return True


        '''


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
        '''
