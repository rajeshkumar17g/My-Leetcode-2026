class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:

        s1=""
        for string in word1:
            s1=s1+string
        print(s1)
        s2=""
        for string in word2:
            s2=s2+string
        print(s2)
        
        n=len(s1)
        m=len(s2)
        if n!=m:
            return False
        for i in range(n):
           if s1[i]!=s2[i]:
                return False
        return True
        