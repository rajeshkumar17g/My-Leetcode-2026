class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        for i in range(-1,-(len(s)+1),-1):
            if s[i]!=' ':
                break
        count=0
        for index in range(i,-(len(s)+1),-1):
            if s[index]==' ':
                break
            count=count+1
        return count
        


        '''
        return len(s.split()[-1])
        '''