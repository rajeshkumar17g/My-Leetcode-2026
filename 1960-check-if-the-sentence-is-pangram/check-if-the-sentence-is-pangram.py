class Solution:
    def checkIfPangram(self, s: str) -> bool:
        seen=[]
        for ch in s:
            if ch not in seen:
                seen.append(ch)
        return len(seen)==26