class Solution:
    def countGoodSubstrings(self, s: str) -> int:
        count=0
        for index in range(0,len(s)-3+1):
           if len(set(s[index:index+3]))==3:
                count+=1
        return count