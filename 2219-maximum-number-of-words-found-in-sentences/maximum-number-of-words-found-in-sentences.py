class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        m=0
        for s in sentences:
            words=len(s.split())
            m=max(m,words)
        return m
