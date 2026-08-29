class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        d1={}
        d2={}
        for i in range(len(s)):
            ch1=s[i]
            ch2=t[i]
            if(ch1 in d1 and d1[ch1]!=ch2):
                return False
            if(ch2 in d2 and d2[ch2]!=ch1):
                return False
            d1[ch1]=ch2
            d2[ch2]=ch1
        return True
                
