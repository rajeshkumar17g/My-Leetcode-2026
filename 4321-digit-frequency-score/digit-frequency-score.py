class Solution:
    def digitFrequencyScore(self, n: int) -> int:
        d={}
        for ch in str(n):
            if ch in d:
                d[ch]+=1
            else:
                d[ch]=1
        s=0
        for k,v in d.items():
            s+=int(k)*d[k]
        return s