class Solution:
    def lengthOfLastWord(self, s: str) -> int:
            for index in range(-1,-(len(s)+1),-1):
                if s[index]!=' ':
                    break
            c=0
            for i in range(index,-(len(s)+1),-1):
                if s[i]==' ':
                    break
                c=c+1
            return c