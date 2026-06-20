class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        d={}
        for ch in s:
            if ch in d:
                d[ch]+=1
            else:
                d[ch]=1
        return len(set(d.values()))==1