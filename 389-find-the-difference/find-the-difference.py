class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        l=list(t)
        for ch in s:
            l.remove(ch)
        return l[0]
